import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileActions {

    public static List<String> readFileText (String path) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get(path));

        List<String> tokens = new ArrayList<>();
        for (String line : lines) {
            Collections.addAll(tokens, line.split("\n"));
        }
        return  tokens;
    }


    public static void writeTextToFile (String path, ArrayList listOfLines) throws IOException {

        File file = new File(path);
        PrintWriter writer = new PrintWriter(new FileWriter(file, true));
        for(Object line : listOfLines) {
            writer.append(line + "\n");
        }
        writer.close();
    }
}