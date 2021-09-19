import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
       /* final String splitMe = "123,test,444,\"don't split, this\",more test,1";
        final String[] splitByQuote = splitMe.split("\"");
        final String[][] splitByComma = new String[splitByQuote.length][];
        for (int i = 0; i < splitByQuote.length; i++) {
            String part = splitByQuote[i];
            if (i % 2 == 0) {
                splitByComma[i] = part.split(",");
            } else {
                splitByComma[i] = new String[1];
                splitByComma[i][0] = part;
            }
        }
        for (String parts[] : splitByComma) {
            for (String part : parts) {
                System.out.println(part);
            }
        }*/

        try (BufferedReader reader = new BufferedReader(new FileReader(/*fileName*/"start.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
//}