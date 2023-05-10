
/**
 *
 * @author THAYCACAC
 */
public class Manager {

    //dispaly menu
    public static int menu() {
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = Validate.checkInputIntLimit(1, 3);
        return choice;
    }

    //allow user calculate Superlative Equation
    public static void superlativeEquation() {
        double x;
        System.out.print("Enter A: ");
        double a = Validate.checkInputDouble();
        System.out.print("Enter B: ");
        double b = Validate.checkInputDouble();
        x = -b / a;
        if (a == 0 && b == 0) {
            System.out.println("Infinite solution");
        } else if (a == 0 && b != 0) {
            System.out.println("No solution");
        } else {

            System.out.println("Solution: x = " + x);
        }
        System.out.print("Number is odd: ");
        Validate.checkOdd(a);
        Validate.checkOdd(b);
        Validate.checkOdd(x);
        System.out.println("");
        System.out.print("Number is even: ");
        Validate.checkEven(a);
        Validate.checkEven(b);
        Validate.checkEven(x);
        System.out.println("");
        System.out.print("Number is perfect square: ");
        Validate.checkSquareNumber(a);
        Validate.checkSquareNumber(b);
        Validate.checkSquareNumber(x);
        System.out.println("");
    }

    //allow user calculate Quadratic Equation
    public static void quadraticEquation() {
        double x1, x2;
        System.out.print("Enter A: ");
        double a = Validate.checkInputDouble();
        System.out.print("Enter B: ");
        double b = Validate.checkInputDouble();
        System.out.print("Enter C: ");
        double c = Validate.checkInputDouble();
 double delta = b * b - 4 * a * c;
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Infinite solution");
        } else if (a == 0 && b == 0 && c != 0) {
            System.out.println("No solution");
        } else if (a==0 && b!=0) {
            x1 = -c/b;
        } else{
             
        if (delta < 0) {
            System.out.println("No solution");
        } else if (delta == 0) {
            x1 = -b / 2 * a;
            System.out.println("Solution: x = " + x1);
        } else {

            System.out.println("Solution: x1 = " + x1 + " and x2 = " + x2);
        }
        }

      
        System.out.print("Number is odd: ");
        Validate.checkOdd(a);
        Validate.checkOdd(b);
        Validate.checkOdd(c);
        Validate.checkOdd(x1);
        Validate.checkOdd(x2);
        System.out.println("");
        System.out.print("Number is even: ");
        Validate.checkEven(a);
        Validate.checkEven(b);
        Validate.checkEven(c);
        Validate.checkEven(x1);
        Validate.checkEven(x2);
        System.out.println("");
        System.out.print("Number is perfect square: ");
        Validate.checkSquareNumber(a);
        Validate.checkSquareNumber(b);
        Validate.checkSquareNumber(c);
        Validate.checkSquareNumber(x1);
        Validate.checkSquareNumber(x2);
        System.out.println("");
    }
}
