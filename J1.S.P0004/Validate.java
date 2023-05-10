
import java.util.Scanner;


public class Validate {
    // kiem tra so co phai int khong
    private static final Scanner sc = new Scanner(System.in);
    
   public static int checkInputInt() {
        // lặp đến khi đúng int
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result <=0 ) {
                    System.err.println("Please input positive int number");
                    System.out.print("Enter again: ");
                }
                else return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input positive int number");
                System.out.print("Enter again: ");
            }
        }
    }
}
