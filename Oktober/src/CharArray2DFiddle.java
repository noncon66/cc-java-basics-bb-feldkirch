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
        //drawLine(field, 0, 0, 20, 0);
        //drawLine(field, 0, 0, 0, 20);
        //drawLine(field, 20, 0, 20, 20);
        //drawLine(field, 0, 20, 20, 20);
        //drawRectangleFromLines(field, 10, 40);
        drawCircle(field, 10);
        drawCircle(field, 5);
        drawCircle(field, 15);
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

    private static char[][] drawLine(char[][] field, int startRow, int startCol, int endRow, int endCol) {
        int deltaRow = endRow - startRow;
        int deltaCol = endCol - startCol;
        float pitch = (deltaCol != 0) ? (float) deltaRow / (float) deltaCol : deltaRow * 1000;
        int directionRow = (deltaRow != 0) ? deltaRow / Math.abs(deltaRow) : 0;
        int directionCol = (deltaCol != 0) ? deltaCol / Math.abs(deltaCol) : 0;

        if (Math.abs(pitch) <= 1) {
            for (int col = startCol; col != endCol; col += directionCol) {
                int row = startRow + Math.round((col - startCol) * pitch);
                field[row][col] = 'x';
            }

        } else {
            for (int row = startRow; row != endRow; row += directionRow) {
                int col = startCol + Math.round((row - startRow) / pitch);
                field[row][col] = 'x';
            }
        }
        field[endRow][endCol] = 'x';
        return field;
    }

    private static char[][] drawRectangleFromLines(char[][] field, int width, int height) {
        drawLine(field, 0, 0, 0, width - 1);
        drawLine(field, 0, width - 1, height - 1, width - 1);
        drawLine(field, height - 1, width - 1, height - 1, 0);
        drawLine(field, height - 1, 0, 0, 0);
        return field;

    }

    private static char[][] drawCircle(char[][] field, int radius) {
        int center = field.length / 2;
        int row = 0;
        int col = 0;
        int currentRow = 0;
        int currentCol = 0;
        float deltaCols = 0;
        float deltaRows = 0;

        //Zeichne Kreis über die Spalten (cols)
        for (col = center - radius; col <= center + radius; col++) {
            row = (int) (center + Math.round(Math.sqrt(Math.pow(radius, 2) - Math.pow(radius - currentRow, 2))));
            field[row][col] = 'x';
            row = (int) (center - Math.round(Math.sqrt(Math.pow(radius, 2) - Math.pow(radius - currentRow, 2))));
            field[row][col] = 'x';
            currentRow++;
        }
        //Zeichne Kreis nochmal über die Zeilen (rows)
        for (row = center - radius; row <= center + radius; row++) {
            col = (int) (center + Math.round(Math.sqrt(Math.pow(radius, 2) - Math.pow(radius - currentCol, 2))));
            field[row][col] = 'x';
            col = (int) (center - Math.round(Math.sqrt(Math.pow(radius, 2) - Math.pow(radius - currentCol, 2))));
            field[row][col] = 'x';
            currentCol++;
        }

        return field;
    }

}
