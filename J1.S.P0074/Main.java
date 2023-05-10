
public class Main {

    public static void main(String[] args) {
        int[][] matrix1 = null;
        int[][] matrix2 = null;
        while (true) {
            System.out.println("1. Addition Matrix");
            System.out.println("2. Subtraction Matrix");
            System.out.println("3. Multiplication Matrix");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = Validate.checkIntLimit(1, 4);

            try {
                matrix1 = MatrixCalculator.inputMatrix(1);
                matrix2 = MatrixCalculator.inputMatrix(2);

                switch (choice) {
                    case 1:
                        System.out.println("---------Result--------");
                        MatrixCalculator.displayMatrix(matrix1);
                        System.out.println("+");
                        MatrixCalculator.displayMatrix(matrix2);
                        System.out.println("=");
                       
                        int[][] Resultadd = MatrixCalculator.additionMatrix(matrix1, matrix2);
                        MatrixCalculator.displayMatrix(Resultadd);
                         System.out.println("-----------------------\n");
                        break;
                    case 2:
                        System.out.println("---------Result--------");
                        MatrixCalculator.displayMatrix(matrix1);
                        System.out.println("-");
                        MatrixCalculator.displayMatrix(matrix2);
                        System.out.println("=");
                        int[][] Resultsub = MatrixCalculator.subtractionMatrix(matrix1, matrix2);
                        MatrixCalculator.displayMatrix(Resultsub);
                        System.out.println("-----------------------\n");
                        break;
                    case 3:
                        System.out.println("---------Result--------");
                        MatrixCalculator.displayMatrix(matrix1);
                        System.out.println("*");
                        MatrixCalculator.displayMatrix(matrix2);
                        System.out.println("=");
                        int[][] Resultmul = MatrixCalculator.multiplicationMatrix(matrix1, matrix2);
                        MatrixCalculator.displayMatrix(Resultmul);
                        System.out.println("-----------------------\n");
                        break;
                    case 4:
                        return;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Can't Calculate\n");
                System.out.println("-----------------------\n");
                
            }
        }

    }

}
