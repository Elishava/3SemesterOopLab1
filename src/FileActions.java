import java.io.*;

public class FileActions {

    public static String readFileText (String path) throws IOException {
        File fileForRead = new File(path);
        String fileText = "";
        char[] a = new char[(int) fileForRead.length()];
        //String fileName = fileForRead.getName();


        try (FileReader reader = new FileReader(path)) {
            while (reader.read() != -1) {
                reader.read(a);
            }
            for (char c : a)
                fileText += c;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return fileText;
    }


    public static void writeTextToFile (String path, String textToWrite) throws IOException {

        try (FileWriter writer = new FileWriter(path)) {
            writer.write(textToWrite);
        }
    }
}