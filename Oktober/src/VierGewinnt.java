public class VierGewinnt {

    public static void main(String[] args) {
        char[][] field = new char[7][6];
        char charOfPlayer1 = 'x';
        char charOfPlayer2 = 'o';
        int player = 1;
        int selectedRow = 0;


    }

    private static int nextPlayer(int recentPlayer) {
        int newPlayer = 0;
        switch (recentPlayer) {
            case 1:
                newPlayer = 2;
                break;
            case 2:
                newPlayer = 1;
                break;
        }
        return newPlayer;
    }

    private static boolean checkCols(String[][] field, char charOfPlayer) {
        int counter = 0;
        for (int i = 0; (i < field.length) || (counter < 4); i++) {
            counter = 0;
            for (int j = 0; (j < field[0].length) || (counter < 4); j++) {
                if (field[i][j].equals(charOfPlayer)) {
                    counter++;
                } else {
                    counter = 0;
                }
            }
        }
        if (counter == 4) return true;
        else return false;
    }


}
