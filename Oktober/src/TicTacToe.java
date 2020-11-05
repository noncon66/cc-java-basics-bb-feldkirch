import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        char[][] court = new char[3][3];
        boolean gameOver = false;
        int player = 1;
        while (!gameOver) {
            playMove(court, player);
            printCourt(court);
            //checkGameOver(court);
            player = togglePlayer(player);

        }


    }


    public static void playMove(char[][] court, int player) {
        Scanner input = new Scanner(System.in);
        boolean fieldNotEmpty = true;
        int row = -1;
        int col = -1;
        while (fieldNotEmpty) {
            System.out.println("Spieler " + player + " ist an der Reihe!");

            row = getUserInput(input, "Reihe");
            col = getUserInput(input, "Spalte");

            fieldNotEmpty = court[row][col] != 0;
            if (fieldNotEmpty) {
                System.err.println("Feld belegt!");
            }
        }

        court[row][col] = getPlayerCharacter(player);

    }

    private static int getUserInput(Scanner scanner, String type) {
        int input = -1;
        while (input < 0 || input > 2) {
            System.out.println("Gib die " + type + " ein (1-3)");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt() - 1;
            } else {
                scanner.next();
            }
        }
        return input;
    }

    private static char getPlayerCharacter(int player) {
        if (player == 1) return 'X';
        return 'O';
    }

    public static int togglePlayer(int player) {
        if (player == 1) return 2;
        else return 1;
    }

    private static void printCourt(char[][] court) {
        for (int row = 0; row < court.length; row++) {
            System.out.println(Arrays.toString(court[row]));
        }
    }

/*    private static boolean checkGameOver(char[][] court, int player){
        checkRows(court);
        //checkCols(court);
        //checkDiags(court);
        checkAllFieldsFull(court);

    }

    private static boolean checkAllFieldsFull (char[][] court){
        boolean allFull = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (court[i][j] == 0){
                    allFull = false;
                }
            }
        }
        return allFull;
    }

    private static boolean checkRows (char[][] court){
        boolean rowFull = false;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                boolean merker = false;
                //if (court[row][col] != 0 )

            }
        }


    }
*/
}
