import java.util.Random;
import java.util.Scanner;

public class ZufallszahlErraten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxValue = 50;
        int randomNumber = random.nextInt(maxValue + 1);


        System.out.println("Es wurde einen Zufallzahl zwischen 0 und 50 generiert." +
                "Kannst du sie in 10 Schritten erraten?");

        for (int counter = 0; counter < 10; counter++) {
            System.out.println(counter + 1 + ". Raten: ");
            int guess = scanner.nextInt();
            if (guess < randomNumber) {
                System.out.println("Deine Zahl ist zu klein!");
            } else if (guess > randomNumber) {
                System.out.println("Deine Zahl ist zu groß!");
            } else {
                System.out.println("richtig geraten in " + (counter + 1) + ". Versuchen");
                break;
            }
        }
    }
}
