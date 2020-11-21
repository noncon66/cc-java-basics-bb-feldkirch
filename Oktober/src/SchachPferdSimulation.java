import java.util.Random;
//by Klaus und Lukas
public class SchachPferdSimulation {
    static int startRow = 0;
    static int startCol = 0;
    static int endRow = 7;
    static int endCol = 7;
    static Random random = new Random();

    public static void main(String[] args) {

        int row = startRow;
        int col = startCol;
        boolean isEnd = false;
        int tries = 0;
        printChessField2(row, col);

        while (!isEnd) {
            int[] move = moveByChanceKlaus(row, col);
            row = move[0];
            col = move[1];

            isEnd = checkEnd(row, col);
            printChessField2(row, col);
            tries++;
            timeSleep(400);
        }
        System.out.println("Es wurden " + tries + " Versuche benötigt");
    }



    private static void printChessField2(int rowPosition, int colPosition) {
        System.out.println("  ________________________________");
        for (int row = 7; row >= 0; row--) {
            int userRow = row + 1;
            System.out.print(userRow + "|");
            for (int col = 0; col <= 7; col++) {
                if ((col == colPosition) && (row == rowPosition)) System.out.print(" X |");
                else System.out.print("   |");
            }
            System.out.println("\n  --------------------------------");
        }
        System.out.println("   a   b   c   d   e   f   g   h");
        System.out.println();
    }


    private static int[] moveByChanceKlaus(int currRow, int currCol) {
        int[] newCorrdinates = new int[2];
        int direction = random.nextInt(8);
        int deltaRow = 0;
        int deltaCol = 0;
        int newRow = 0;
        int newCol = 0;
        boolean isOnFiled = false;

        while (!isOnFiled) {
            direction = random.nextInt(8);
            switch (direction) {
                case (0):
                    deltaRow = 2;
                    deltaCol = 1;
                    break;
                case (1):
                    deltaRow = 1;
                    deltaCol = 2;
                    break;
                case (2):
                    deltaRow = -1;
                    deltaCol = 2;
                    break;
                case (3):
                    deltaRow = -2;
                    deltaCol = 1;
                    break;
                case (4):
                    deltaRow = -2;
                    deltaCol = -1;
                    break;
                case (5):
                    deltaRow = -1;
                    deltaCol = -2;
                    break;
                case (6):
                    deltaRow = 1;
                    deltaCol = -2;
                    break;
                case (7):
                    deltaRow = 2;
                    deltaCol = -1;
                    break;
            }
            newRow = currRow + deltaRow;
            newCol = currCol + deltaCol;
            isOnFiled = onField(newRow, newCol);

        }
        newCorrdinates[0] = newRow;
        newCorrdinates[1] = newCol;

        return newCorrdinates;
    }


    // Helper methods --------------------------------------------------------------------------
    private static boolean checkEnd(int row, int col) {
        boolean isEnd = false;

        if (row == endRow && col == endCol) {
            isEnd = true;
        }
        return isEnd;
    }

    private static boolean onField(int row, int col) {
        boolean onField = false;

        if (row >= 0 && row <= 7 && col >= 0 && col <= 7) {
            onField = true;
        }
        return onField;
    }

    public static void timeSleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException ie) {
            // I don't care about that
        }
    }
}