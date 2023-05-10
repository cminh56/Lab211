



public class Main {
    
        //display menu
    public static int menu() {
        System.out.println("1. Normal Calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = Validate.checkFunction();
        return choice;
    }       

   
    
    public static void main(String[] args) {
       while (true) {
            int choice = menu();
            switch (choice) {
                case 1:
                    ManageCaculator.normalCalculator();
                    break;
                case 2:
                    ManageCaculator.BMICalculator();
                    break;
                case 3:
                    return;
            }
        }
    }
}
