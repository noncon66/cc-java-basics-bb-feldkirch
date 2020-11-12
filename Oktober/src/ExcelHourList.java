import java.util.*;

public class ExcelHourList {
    public static void main(String[] args) {

        String[][] hourlist = {{"Daniel", "7"}, {"Alex", "9"}, {"Michael", "8"}, {"Daniel", "5"}, {"Daniel", "3"},
                {"Alex", "7"}, {"Michael", "6"}, {"Alex", "4"}, {"Michael", "5"}};

        printListFrom2dArray(getTotalHoursPerPerson(hourlist));
    }

    private static void printListFrom2dArray(String[][] sums) {
        for (int col = 0; col < sums.length; col++) {
            for (int row = 0; row < sums[col].length; row++) {
                System.out.print(sums[col][row]);
            }
            System.out.println();
        }

    }


    private static List<String> getPersons(String[][] hourlist) {
        List<String> names = new ArrayList();
        for (int i = 0; i < hourlist[0].length; i++) {
            if (!names.contains(hourlist[0][i])) {
                names.add(hourlist[0][i]);
            }
        }
        return names;
    }


    private static String[][] getTotalHoursPerPerson(String[][] hourlist) {
        Collection<String> names = getPersons(hourlist);
        String[][] sums = new String[2][names.size()];
        int i = 0;
        for (var name : names
        ) {
            sums[0][i] = name;
            int sum = 0;
            for (int j = 0; j < hourlist[1].length; j++) {
                if (hourlist[0][j] == name) {
                    sum += Integer.parseInt(hourlist[1][j]);
                    hourlist[1][j] = Integer.toString(sum);
                }
                i++;
            }

        }
return sums;
    }
}
