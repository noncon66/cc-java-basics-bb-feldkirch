import java.util.Arrays;

public class CharArray2DFiddle {
    public static void main(String[] args) {
        int rows = 40;
        int cols = 40;
        char[][] field = initArray(rows, cols);

        //System.out.println(Arrays.deepToString(field));
        //print2DArray(field);
        //insertSquare(field, 10);
        //insertMiddleSquare(field, 20);
        drawLine(field,5,5, 10,20);
        print2DArray(field);
    }

    private static char[][] initArray(int rows, int cols) {
        char[][] field = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                field[row][col] = ' ';
            }
        }
        return field;
    }

    private static void print2DArray(char[][] field) {
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                System.out.print(field[row][col]);
            }
            System.out.println();
        }

    }


    private static char[][] insertSquare(char[][] field, int squareSize) {
        for (int col = 0; col < squareSize; col++) {
            field[0][col] = 'o';
        }
        for (int row = 1; row < squareSize - 1; row++) {
            field[row][0] = 'o';
            field[row][squareSize - 1] = 'o';
        }
        for (int col = 0; col < squareSize; col++) {
            field[squareSize - 1][col] = 'o';

        }
        return field;
    }

    private static char[][] insertMiddleSquare(char[][] field, int squareSize) {
        int fieldWidth = field[0].length;
        int fieldHeight = field.length;
        int startRow = (fieldHeight - squareSize) / 2;
        int startCol = (fieldWidth - squareSize) / 2;

        for (int col = startCol; col < startCol + squareSize; col++) {
            field[startRow][col] = 'o';
        }
        for (int row = startRow + 1; row < startRow + squareSize - 1; row++) {
            field[row][startCol] = 'o';
        }
        for (int row = startRow + 1; row < startRow + squareSize - 1; row++) {
            field[row][startCol + squareSize - 1] = 'o';
        }
        for (int col = startCol; col < startCol + squareSize; col++) {
            field[startRow + squareSize - 1][col] = 'o';

        }
        return field;
    }

    private static char[][] drawLine(char[][] field, int startX, int startY, int endX, int endY) {
        int deltaX = endX - startX;
        int deltaY = endY - startY;

        int x = startX;
        int y = startY;
        while (x <= endX && y <= endY ){
            field[x][y] = 'o';
            x = x + deltaY/deltaX;
            y = y + deltaX/deltaY;
        }
        return field;
    }

}
