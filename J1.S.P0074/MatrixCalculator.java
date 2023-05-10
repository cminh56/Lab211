
public class MatrixCalculator {

    public static int[][] inputMatrix(int n) {
        System.out.print("Enter Row Matrix: ");
        int row = Validate.checkInputInt();
        System.out.print("Enter Colum Matrix: ");
        int col = Validate.checkInputInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter Matrix" + n + "[" + i + "]" + "[" + j + "]:");
                matrix[i][j] = Validate.checkInputInt();
            }
        }
        return matrix;
    }

    public static int[][] additionMatrix(int[][] matrix1, int[][] matrix2) {

        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        int[][] Result = new int[row1][col1];
        if (col1 != col2 || row1 != row2) {

            throw new IllegalArgumentException();
        } else {

            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    Result[i][j] = matrix1[i][j] + matrix2[i][j];
                }

            }
            return Result;
        }

    }

    public static int[][] subtractionMatrix(int[][] matrix1, int[][] matrix2) {

        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        int[][] Result = new int[row1][col1];

        if (col1 != col2 || row1 != row2) {

            throw new IllegalArgumentException();

        } else {

            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    Result[i][j] = matrix1[i][j] - matrix2[i][j];
                }

            }
            return Result;
        }

    }

    public static int[][] multiplicationMatrix(int[][] matrix1, int[][] matrix2) {

        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        if (col1 != row2) {

            throw new IllegalArgumentException();
        }
        int[][] Result = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                Result[i][j] = 0;
            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    Result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return Result;
    }

    public static void displayMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }
    }
}
