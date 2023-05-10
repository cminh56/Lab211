
public class ManageCaculator {
    //calculator normal

    public static void normalCalculator() {
        double memory;

        System.out.print("Enter number: ");
        memory = Validate.checkInputNumber();
        //vong lap se dung lai khi user nhap "="

        while (true) {
            //user chon phep tinh
            System.out.print("Enter operator: ");
            String operator = Validate.checkInputOperator();
            switch (operator) {

                case "+":
                    memory += Validate.inputNumber();
                    System.out.println("Memory: " + memory);
                    break;
                case "-":
                    memory -= Validate.inputNumber();
                    System.out.println("Memory: " + memory);
                    break;
                case "*":
                    memory *= Validate.inputNumber();
                    System.out.println("Memory: " + memory);
                    break;
                case "/":

                    memory /= Validate.inputNumberdiv();
                    System.out.println("Memory: " + memory);
                    break;
                case "^":
                    memory = Math.pow(memory, Validate.inputNumber());
                    System.out.println("Memory: " + memory);
                    break;
                case "=":
                    System.out.println("Result: " + memory);
                    return;
            }

        }

    }

    //check BMI
    public static String checkBMI(double bmi) {
        if (bmi < 19) {
            return "Under-standard.";
        } else if (bmi < 25) {
            return "Standard.";
        } else if (bmi < 30) {
            return "Overweight.";
        } else if (bmi < 40) {
            return "Fat-should lose weight";
        } else {
            return "Very fat - should lose weight immediately";
        }
    }

    //BMI calculator
    public static void BMICalculator() {
        System.out.print("Enter Weight(kg): ");
        double weight = Validate.checkInputNumber();
        System.out.print("Enter Height(cm): ");
        double height = Validate.checkInputNumber();
        double bmi = weight / (height / 100 * height / 100);
        System.out.printf("BMI number: %.2f\n", bmi);
        System.out.println("BMI Status: " + checkBMI(bmi));
    }
}
