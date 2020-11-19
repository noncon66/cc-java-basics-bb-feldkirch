import java.io.IOException;
import java.util.Arrays;

public class FeldkirchBudget {

    public static void main(String[] args) {
        String stdPath = "C:\\Users\\DCV\\Klaus\\cc-java-basics-bb-feldkirch\\Oktober\\src\\";
        String readFileName = "offenerhaushalt_fk_2019.csv";
        String seperator = ";";
        String[][] budgetList = null;

        // Liste aus CSV importieren
        try {
            budgetList = GeneralCSVReader.getArrayFromFile(stdPath + readFileName, 3, seperator);
        } catch (IOException e) {
            System.err.println("Fehler beim Lesen des Files: " + e);
            System.exit(-1);
        }
        // Liste aufräumen

        String[][] cleanBudgetList = cleanList(budgetList);

        //Gesamtbudget
        int totalBudget = getTotalBudget(cleanBudgetList);
        System.out.println("Gesamtbudget: " + totalBudget);

        //Top 10
        printTop10(cleanBudgetList, "max");
        printTop10(cleanBudgetList, "min");

        //Summe der Budgetposten und Anteil am Gesamtbudget in denen der Suchstring enthalten ist
        String searchString = "Volksschule, Mittelschule, Poly";
        printSumAndShareForSearchString(cleanBudgetList, searchString);

        searchString = "Kindergarten";
        printSumAndShareForSearchString(cleanBudgetList, searchString);

        searchString = "Feuerwehr";
        printSumAndShareForSearchString(cleanBudgetList, searchString);

        searchString = "";
        printSumAndShareForSearchString(cleanBudgetList, searchString);

    }

    private static String[][] cleanList(String[][] budgetList) {
        int rowCount = 0;
        for (int i = 1; i < budgetList.length; i++) { //zählt die gültigen Einträge; lässt den ersten aus
            if (Integer.parseInt(budgetList[i][2]) != 0 || !tryParseInt(budgetList[i][2])) {
                rowCount++;
            }
        }

        String[][] newList = new String[rowCount][budgetList[0].length]; //Erstellt neues Array in der richtigen Größe
        rowCount = 0;
        for (int i = 1; i < budgetList.length; i++) { //Befüllt das neue Array
            if (Integer.parseInt(budgetList[i][2]) != 0 || !tryParseInt(budgetList[i][2])) {
                newList[rowCount] = budgetList[i];
                rowCount++;
            }
        }
        System.out.println(rowCount + " gültige Werte in der Liste");
        return newList;
    }


    private static int getTotalBudget(String[][] cleanBudgetList) {
        int totalBudget = 0;
        for (int i = 0; i < cleanBudgetList.length; i++) {
            totalBudget += Integer.parseInt(cleanBudgetList[i][2]);
        }
        return totalBudget;
    }


    private static void printSumAndShareForSearchString(String[][] cleanBudgetList, String searchString) {
        String[] searchArray = searchString.split(", ");
        double shareOfTotal = 0.0;
        int sumForSearchString = 0;
        for (int i = 0; i < searchArray.length; i++) {
            for (int j = 0; j < cleanBudgetList.length; j++) {
                if (cleanBudgetList[j][0].toLowerCase().contains(searchArray[i].toLowerCase())) {
                    sumForSearchString += Integer.parseInt(cleanBudgetList[j][2]);
                }
            }
        }
        System.out.println("Aufwände für " + Arrays.toString(searchArray) + ": EUR " + sumForSearchString);
        shareOfTotal = (double) sumForSearchString / getTotalBudget(cleanBudgetList) * 100;
        System.out.println("das sind " + Math.round((shareOfTotal) * 100) / 100d + "% des Gesamtbudgets");
    }


    private static String[][] sortList(String[][] cleanList) { //Sortiert Aufsteigend nach "Voranschlag"
        String[][] sortedList = Arrays.copyOf(cleanList, cleanList.length);
        for (int j = 0; j < sortedList.length - 1; j++) {
            for (int i = 0; i < sortedList.length - 1 - j; i++) {
                if (Integer.parseInt(sortedList[i][2]) > Integer.parseInt(sortedList[i + 1][2])) {
                    String[] temp = sortedList[i];
                    sortedList[i] = sortedList[i + 1];
                    sortedList[i + 1] = temp;
                }
            }
        }

        return sortedList;
    }


    private static void printTop10(String[][] cleanBudgetList, String minmax) { // "min" or "max"
        String[][] sortedList = sortList(cleanBudgetList); //holt sortiertes Array

        if (minmax.equals("max")) { //wenn "max" dann die höchsten Positionen
            System.out.println("Die 10 höchsten Positionen:");
            for (int i = sortedList.length - 1; i > sortedList.length - 11; i--) {
                System.out.println(sortedList[i][0] + " (" + sortedList[i][1] + ") EUR " + sortedList[i][2]);
            }

        } else if (minmax.equals("min")) { //wenn "min" dann die niedrigsten Positionen
            System.out.println();
            System.out.println("Die 10 niedrigsten Positionen:");
            for (int i = 0; i < 10; i++) {
                System.out.println(sortedList[i][0] + " (" + sortedList[i][1] + ") EUR " + sortedList[i][2]);
            }
        } else {
            System.out.println("Ungültige Eingabe");
        }
        System.out.println();
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

