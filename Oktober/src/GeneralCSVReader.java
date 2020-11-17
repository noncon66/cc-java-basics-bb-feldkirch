import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class GeneralCSVReader {

    public static String[][] getArrayFromFile(String path, int colCount, String separator) throws IOException {

        List<String> lines = Files.readAllLines(Path.of(path)); //Erstellt List-Objekt aus Datei
        int len = lines.size();
        String[][] ItemList = new String[len][colCount]; //Temporäre Liste mit falschen Einträgen als "null"

        for (int i = 0; i < len; i++) { //geht jeden eintrag der Liste durch
            if (lines.get(i) != null || lines.get(i).isEmpty()) { //überspringt leere Einträge
                String[] lineArray = lines.get(i).split(separator); // Splittet den String der Zeile am "seperator"; ergibt ein Array
                ItemList[i] = lineArray; //schreibt den Wert

            }
        }
        return ItemList;
    }
}

