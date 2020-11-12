public class HourList3 {

    public static void main(String[] args) {
        String[][] hourList =
                SimpleCSVReader.readCSV(
                "C:\\Users\\DCV\\Klaus\\cc-java-basics-bb-feldkirch\\Oktober\\src\\Stunden.csv",
                ",");;

        int[] hoursSum = calculateHoursSum(hourList);
        int loanPerHour = 8;
        int[] salary = calculateLoan(hoursSum, loanPerHour);
        printLoan(salary);

        float[] hoursAvg = calculateHoursAvg(hourList);
        printHoursAvg(hoursAvg);





    }

    private static void printLoan(int[] hoursAvg) {
        System.out.println("Alex bekommt " + hoursAvg[0] + "€ ausbezahlt.");
        System.out.println("Daniel bekommt " + hoursAvg[1] + "€ ausbezahlt.");
        System.out.println("Michael bekommt " + hoursAvg[2] + "€ ausbezahlt.");
    }

    private static void printHoursAvg(float[] salary) {
        System.out.println("Alex arbeitet " + salary[0] + "h pro Tag.");
        System.out.println("Daniel arbeitet " + salary[1] + "h pro Tag.");
        System.out.println("Michael arbeitet " + salary[2] + "h pro Tag.");
    }

    private static int[] calculateLoan(int[] hoursSum, int loanPerHour) {
        int[] salary = new int[3];
        for (int i = 0; i < hoursSum.length; i++) {
            salary[i] = hoursSum[i] * loanPerHour;
        }
        return salary;
    }


    private static int[] calculateHoursSum(String[][] hourList) {
        int[] hoursSum = new int[3];
        //for (String[] entry : hourList) {
        for (int i = 1; i < hourList.length; i++) {
            String[] entry = hourList[i];
            String name = entry[0];
            int hoursSumIndex = 0;
            switch (name) {
                case "Alex":
                    hoursSumIndex = 0;
                    break;
                case "Daniel":
                    hoursSumIndex = 1;
                    break;
                case "Michael":
                    hoursSumIndex = 2;
                    break;
            }

            hoursSum[hoursSumIndex] = hoursSum[hoursSumIndex] + Integer.parseInt(entry[1]);
        }
        return hoursSum;
    }

    private static float[] calculateHoursAvg(String[][] hourList) {
        float[] hoursAvg = new float[3];
        for (int i = 1; i < hourList.length; i++) {
            String[] entry = hourList[i];
            String name = entry[0];
            int hoursAvgIndex = 0;
            switch (name) {
                case "Alex":
                    hoursAvgIndex = 0;
                    break;
                case "Daniel":
                    hoursAvgIndex = 1;
                    break;
                case "Michael":
                    hoursAvgIndex = 2;
                    break;
            }

            hoursAvg[hoursAvgIndex] = (float) (hoursAvg[hoursAvgIndex]/2.0 + Integer.parseInt(entry[1])/2.0);
        }
        return hoursAvg;
    }

    /*private static String[][] getHoursList() {
        String[][] hourList = {{"Daniel", "7"},
                {"Alex", "9"},
                {"Michael", "8"},
                {"Daniel", "5"},
                {"Daniel", "3"},
                {"Alex", "7"},
                {"Michael", "6"},
                {"Alex", "4"},
                {"Michael", "5"}};
        return hourList;
    }
    */

}

