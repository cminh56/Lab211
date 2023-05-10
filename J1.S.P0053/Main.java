
import java.util.Scanner;


public class Main {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] a = new int[0];
        //loop until user want to exit
        while (true) {
            int choice = View.menu();
            switch (choice) {
                case 1:
                    a = Sort.inputValueOfArray();
                    break;
                case 2:
                    Sort.sortAscending(a);
                   View.printAscending(a);
                    break;
                case 3:
                    Sort.sortDescending(a);
                    View.printDescending(a);
                    break;
                case 4:
                    return;
            }
        }
    }

}
