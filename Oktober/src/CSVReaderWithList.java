import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class CSVReaderWithList {

    public static String[][] getArrayFromFile(String path, int colCount, String separator) throws IOException {

        List<String> lines = Files.readAllLines(Path.of(path)); //Erstellt List-Objekt aus Datei
        int len = lines.size();
        String[][] tempList = new String[len][colCount]; //Temporäre Liste mit falschen Einträgen als "null"
        Boolean errorsOccured = false;
        int correctLineNumber = 0; //Zähler für korrekte Einträge

        for (int i = 0; i < len; i++) { //geht jeden eintrag der Liste durch

            if (lines.get(i) != null || lines.get(i).isEmpty()) { //überspringt leere Einträge
                String[] lineArray = lines.get(i).split(separator); // Splittet den String der Zeile am "seperator"; ergibt ein Array
                if (tryParseInt(lineArray[1])) { //prüft, ob der 2. Wert ein Int ist!
                    tempList[i] = lineArray; //schreibt den Wert
                    correctLineNumber++; //zählt die korrekten Einträge
                } else {
                    errorsOccured = true;
                    System.out.println("Fehler im Eintrag " + i + ": "
                            + Arrays.toString(lineArray) + " (wurde entfernt)"); //Fehlerausgabe
                }
            }
        }
        if (!errorsOccured) System.out.println("Datei ohne Fehler konvertiert!");

        String[][] hourList = new String[correctLineNumber][colCount]; //erstellt Array in der richtigen Länge (korrekte Einträge)
        int j = 0;
        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i][0] != null){ // schreibt nur korrekte Werte in neues Array
                hourList[j] = tempList[i];
                j++;
            }
        }
        return hourList;
    }

    static boolean tryParseInt(String value) { //Prüft, ob sich ein String in ein Int konvertieren lässt
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
