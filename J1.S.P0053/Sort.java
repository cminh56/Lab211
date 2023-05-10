
import java.util.Scanner;

public class Sort {

    private static final Scanner sc = new Scanner(System.in);

    //allow user input number of array
    private static int inputSizeOfArray() {
        System.out.println("Input Length Of Arrays");
        while (true) {
            System.out.print("Enter number: ");
            String inputVal = sc.nextLine().trim();
            Integer number = Validate.checkposIn(inputVal);
            if (number == null) {
                System.err.println("Invalid input. Please enter a positive integer.");
            } else {
                return number;
            }
        }
    }

    //allow user input value of array
    public static int[] inputValueOfArray() {
        int n = inputSizeOfArray();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + i + ": ");
            String inputVal = sc.nextLine().trim();
            Integer number = Validate.checkIn(inputVal);
            if (number == null) {
                System.err.println("Invalid input. Please enter an integer.");
                i--;
            } else {
                a[i] = number;
            }
        }
        return a;
    }

    public static int[] sortAscending(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static int[] sortDescending(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] < a[j]) {

                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

  

}
