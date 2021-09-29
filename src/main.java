import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите путь к исходнлму файлу");
        String pathForStartFile = scanner.nextLine();

        System.out.println("введите путь к файлу для вывода ответа");
        String pathForEndFile = scanner.nextLine();

        System.out.println("введите символ разделитель");
        String signDelimiter = scanner.nextLine();

        System.out.println("введите символ которым надо объединить результат");
        String pathUnit = scanner.nextLine();

        /*
         * C:\Users\Gamer\Documents\3 semester\oop\start.csv
         * C:\Users\Gamer\Documents\3 semester\FileToWrite.csv
         */
        FileActions.writeTextToFile(pathForEndFile,
                TextActions.splitBySign(FileActions.readFileText(pathForStartFile),
                        signDelimiter, pathUnit));
    }
}