
import java.util.Arrays;
import java.util.Random;

public class WichtelnGyula {
    static Random random = new Random();

    public static void main(String[] args) {
        String[] names = {"Ali", "Erich", "Lukas", "Dan", "Klaus", "Bokhee", "Irene", "Sabrina", "Marsella", "Michal", "Samet", "Alex", "Gyula"};
        String[] wichtels = Arrays.copyOf(names, names.length);

        while (!isWichtelValid(names, wichtels)) {
            mixWichtels(wichtels);
        }
        printWichtel(names, wichtels);
    }

    private static boolean isWichtelValid(String[] names, String[] wichtels) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(wichtels[i])) {
                return false;
            }
        }
        return true;
    }

    private static void mixWichtels(String[] wichtels) {
        int posA = random.nextInt(wichtels.length);
        int posB = random.nextInt(wichtels.length);
        String temp = wichtels[posA];
        wichtels[posA] = wichtels[posB];
        wichtels[posB] = temp;
    }

    private static void printWichtel(String[] names, String[] wichtels) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " -> " + wichtels[i]);
        }


    }

}
