

import java.util.Scanner;

public class Validate {
    
     private static final Scanner sc = new Scanner(System.in);
    
       public static Integer checkposIn(String inputVal) {
        try {
            int result = Integer.parseInt(inputVal);
            if (result <=0 ) {
                throw new NumberFormatException();
            }
            return result;
        } catch (NumberFormatException e) {
            return null;
        }
    }
       public static Integer checkIn(String inputVal) {
        try {
            int result = Integer.parseInt(inputVal);
            
            return result;
        } catch (NumberFormatException e) {
            return null;
        }
    }
}

