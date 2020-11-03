import java.util.Arrays;
import java.util.Random;

public class Random2DArray {

    public static void main(String[] args) {
        int[][] randomNumbers = new int[7][7];
        for (int row = 0; row < randomNumbers.length; row++) {
            createRandomInt(randomNumbers);
            System.out.println(Arrays.toString(randomNumbers[row]));
        }
        System.out.println(Arrays.toString(calculateRows(randomNumbers)));

    }


    public static void createRandomInt(int[][] randomNumbers) {
        Random rand = new Random();
        for (int row = 0; row < randomNumbers.length; row++) {
            for (int col = 0; col < randomNumbers[row].length; col++) {
                randomNumbers[row][col] = rand.nextInt(21);
            }
        }
    }

    public static int[] calculateRows(int[][] randomNumbers) {
        int[] results = new int[randomNumbers.length];

        for (int row = 0; row < randomNumbers.length; row++) {
            int rowSum = 0;
            for (int col = 0; col < randomNumbers[row].length; col++) {
                rowSum += randomNumbers[row][col];
            }
            results[row] = rowSum;
        }
        return results;
    }

 /*   public static int[] calculateCols(int[][] randomNumbers) {
        int[] results = new int[randomNumbers.length];

        for (int row = 0; row < randomNumbers.length; row++) {
            int rowSum = 0;
            for (int col = 0; col < randomNumbers[row].length; col++) {
                rowSum += randomNumbers[row][col];
            }
            results[row] = rowSum;
        }
        return results;
    }
*/
}

