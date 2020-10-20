import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        int yourSum = 0;
        int compSum = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 1; i <= 6; i++) {
            System.out.println(i + ". Würfeln:");

            int yourDice = random.nextInt(6) + 1;
            System.out.println("Du hast " + yourDice + " gewürfelt");
            yourSum = yourSum + yourDice;
            System.out.println("Dein Punktestand: " + yourSum);

            int compDice = random.nextInt(6) + 1;
            System.out.println("Der Computer hat " + compDice + " gewürfelt");
            compSum = compSum + compDice;
            System.out.println("Computer Punktestand: " + compSum);
            System.out.println();
        }
        if (yourSum > compSum) System.out.println("Du hast gewonnen");
        else if (yourSum < compSum) System.out.println("Du hast verloren");
        else System.out.println("Unentschieden");

    }




}
