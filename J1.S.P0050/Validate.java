
import java.util.Scanner;

public class Validate {

    public static final Scanner sc = new Scanner(System.in);

    //check user input number limit
    public static int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    //check user input double
    public static double checkInputDouble() {
        //loop until user input correct
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.print("Enter again: ");
            }

        }
    }

    //check number is odd or not
    public static boolean checkOdd(double n) {
        if (n % 2 == 1) {
            System.out.print(n + " ");
            return true;
        } else {
            return false;
        }
    }

    //check number is even or not
    public static boolean checkEven(double n) {
        if (n % 2 == 0) {
            System.out.print(n + " ");
            return true;
        } else {

            return false;
        }

    }

    //check number is squarenumber or not
    public static boolean checkSquareNumber(double n) {
        if ((int) Math.sqrt(n) * (int) Math.sqrt(n) == n) {
            System.out.print(n + " ");
            return true;
        } else {
            return false;
        }
    }
}
