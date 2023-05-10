
import java.util.Scanner;


public class Validate {
    
    private static final Scanner sc = new Scanner(System.in);
    
     //nhap gia tri dau vao
    public static double inputNumber() {
        System.out.print("Enter number: ");
        double number = checkInputNumber();
        return number;
    }
    
     public static double inputNumberdiv() {
        System.out.print("Enter number: ");
        double number = checkInputNumberDiv();
        return number;
    }
     //check chuc nang nguoi dung chon
    public static int checkFunction() {
        //vong lap chi dung lai cho den khi nguoi dung nhap dung
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < 1 || result > 3) {
                    throw new NumberFormatException();
                }
                return result;
                //Neu nguoi dung chon ngoai cac chuc nang cho phep thi yeu cau nhap lai
            } catch (NumberFormatException e) {
                System.out.println("Please input number in rage [1 -> 3]");
                System.out.print("Enter again: ");
            }
        }
    }
    
    //allow user input number
    public static double checkInputNumber() {
        //loop until user input correct
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                //neu nguoi dung nhap khac kieu double thi yeu cau nhap lai
                System.out.println("Must be input number");
                System.out.print("Enter again: ");
            }
        }
    }
     //allow user input number
    public static double checkInputNumberDiv() {
        //loop until user input correct
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine());
                if(result==0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                //neu nguoi dung nhap khac kieu double thi yeu cau nhap lai
                System.out.println("Must be input numbers other than 0");
                System.out.print("Enter again: ");
            }
        }
    }
    
    //check input operator
    public static String checkInputOperator() {
        //loop until user input correct
        while (true) {
            String result = sc.nextLine().trim();
            //neu nguoi dung khong nhap gi thi yeu cau nhap lai
            if (result.isEmpty()) {
                System.out.println("Not empty");
                //check nguoi dung co nhap dung dau cua phep toan khong
            } else if (result.equals("+") || result.equals("-")
                    || result.equals("*") || result.equals("/")
                    || result.equals("^") || result.equals("=")) {
                return result;
            } else {
                //neu nguoi dung khong nhap dau cho phep thi yeu cau nhap lai
                System.out.println("Please input (+, -, *, /, ^)");
            }
            System.out.print("Enter again: ");
        }
    }
     
}
