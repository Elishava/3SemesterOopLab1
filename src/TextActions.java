import java.util.ArrayList;

public class TextActions {

    public  static ArrayList splitBySign(String line, String sign) {
        final String[] splitByQuote = line.split("\"");
        final String[][] splitBySign = new String[splitByQuote.length][];
        ArrayList listOfLines = new ArrayList();
        for (int i = 0; i < splitByQuote.length; i++) {
            String part = splitByQuote[i];
            if (i % 2 == 0) {
                splitBySign[i] = part.split(sign);
            } else {
                splitBySign[i] = new String[1];
                splitBySign[i][0] = part;
            }
        }
        for (String parts[] : splitBySign) {
            for (String part : parts) {
                listOfLines.add(part);
            }
        }
        return listOfLines;
    }

    public static String createNewText (ArrayList listOfLines, String delimiter) {
        String newText = "";
        for (int i = 0; i < listOfLines.size(); i++) {
            String element = (String) listOfLines.get(i);
            if (element.length() != 0) {
                if ( i == listOfLines.size() - 1) {
                    newText += element.length() - 1;
                } else  newText += element.length() + delimiter;
            }
        }
        return newText;
    }

}