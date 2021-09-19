import java.io.*;

public class ScanCsvFile {
    public static void readFileText(String[] args) {
       // File fileForRead = new File(path);
       // String fileName = fileForRead.getName();

        try (BufferedReader reader = new BufferedReader(new FileReader(/*fileName*/"start.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
   /* public static FileReader readFileText(String path) throws IOException {
        //File fileForRead = new File(path);
        FileReader fileReader = new FileReader("start.csv");
        fileReader.read();
        //fileForRead.toString();
        return fileReader;
    }*/
    }
}
