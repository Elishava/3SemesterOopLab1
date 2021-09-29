import java.util.ArrayList;
import java.util.List;

public class TextActions {

    public static ArrayList splitBySign(List a, String sign, String delimiter) {

        ArrayList listOfLines = new ArrayList();
        ArrayList newListOfLines = new ArrayList();

        for (int j = 0; j < a.size(); j ++) {

            String stringText = String.valueOf(a.get(j));

            final String[] doNotDivideInto = stringText.split("\"");
            final String[][] splitBySign = new String[doNotDivideInto.length][];

            for (int i = 0; i < doNotDivideInto.length; i++) {
                String part = doNotDivideInto[i];
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
            newListOfLines.add(TextActions.createNewText(listOfLines, delimiter));

            listOfLines.clear();
        }
        return newListOfLines;
    }


    public static String createNewText(ArrayList listOfLines, String delimiter) {
        String newText = "";
        for (int i = 0; i < listOfLines.size(); i++) {
            String element = (String) listOfLines.get(i);
            if (element.length() != 0) {
                if ( i == listOfLines.size() - 1) {
                    newText += element.length();
                } else  newText += element.length() + delimiter;
            }
        }
        return newText;
    }

}