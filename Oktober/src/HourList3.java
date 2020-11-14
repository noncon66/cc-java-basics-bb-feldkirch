import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class HourList3 {

    public static void main(String[] args)  {
        String[][] hourList =
                new String[0][];
        try {
            hourList = CSVReaderWithList.getArrayFromFile(
                    "C:\\Users\\DCV\\Klaus\\cc-java-basics-bb-feldkirch\\Oktober\\src\\Stunden.csv", 2,
                    ",");
        } catch (IOException e) {
            System.err.println("Fehler beim Lesen des Files: " +  e);
        }

        int hourSalry = 8;

        printSummary(getHourDataToEmployeelist(hourList, getEmployeeList(hourList)), hourSalry);


    }

    private static void printSummary(String[][] employeeList, int hourSalry) {
        System.out.println("========================");
        for (int i = 0; i < employeeList.length; i++) {
            int hoursTotal = Integer.parseInt(employeeList[i][1]);
            int daysTotal = Integer.parseInt(employeeList[i][2]);
            double hoursAvg = (double) hoursTotal / daysTotal;
            System.out.println(employeeList[i][0] + ":  Gesamtstunden: " + hoursTotal + "\n" +
                    "        Gesamtlohn: $ " + hoursTotal * hourSalry + "\n" +
                    "        Arbeitstage:  " + daysTotal + "\n" +
                    "        Durschnitt h/d: " + hoursAvg);

            System.out.println("========================");
        }
    }

    private static String[][] getEmployeeList(String[][] hourList) {

        String[] names = new String[hourList.length];
        for (int i = 0; i < hourList.length; i++) {
            names[i] = hourList[i][0];
        }
        //löscht doppelte Werte aus dem Array
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {


                if (names[i].equals(names[j])) {
                    names[j] = "";
                }

            }
        }
        //zählt alle Werte aus Array die nicht leer sind ("Anzahl Mitarbeiter")
        int numberOfEmployees = 0;
        for (int i = 0; i < names.length; i++) {
            if (!names[i].equals("")) {
                numberOfEmployees++;
            }
        }
        //Erstellt neues Array von der Größe "Anzahl Mitarbeiter"
        String[][] employees = new String[numberOfEmployees][4];
        //befüllt das Array mit den nicht leeren Felder aus dem alten Array "names"
        int j = 0;
        for (int i = 0; i < names.length; i++) {
            if (!names[i].equals("")) {
                employees[j][0] = names[i];
                j++;
            }
        }
        return employees;
    }

    private static String[][] getHourDataToEmployeelist(String[][] hourList, String[][] employeeList) {
        // Aufbau: Name | StundenGesamt | Arbeitstage
        for (int i = 0; i < employeeList.length; i++) {
            int hourSum = 0;
            int daysWorked = 0;
            float hoursAvg = 0;
            for (int j = 0; j < hourList.length; j++) {
                if (hourList[j][0].equals(employeeList[i][0])) {
                    hourSum += Integer.parseInt(hourList[j][1]);
                    daysWorked++;
                }
            }
            employeeList[i][1] = Integer.toString(hourSum);
            employeeList[i][2] = Integer.toString(daysWorked);
            hoursAvg = (float) hourSum / (float) daysWorked;
            employeeList[i][3] = Float.toString(hoursAvg);

        }
        return employeeList;
    }

    private static void saveArrayToFile(String filePath, String[][] employeeList) {
        try {
            Files.createFile(Paths.get(filePath));
            for (int i = 0; i < employees.length; i++) {
                String line = employees[i] + "," + salary[i] + "\n";
                Files.write(Paths.get(filePath), line.getBytes(), StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            System.err.println("Error writing CSV file: " + e.getMessage());
            e.printStackTrace();
        }
    }



}

