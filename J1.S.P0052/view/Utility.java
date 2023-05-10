package view;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Utility {

    public static final Scanner scanner = new Scanner(System.in);

    public static final String valid_CODE = "[a-zA-Z0-9 ]+";

    public static final String valid_NAME = "[a-zA-Z ]+";

    public static final String valid_TERRAIN = "[a-zA-Z ]+";

    public static String getString(String message, String errorString, String valid) {
        while (true) {
            System.out.println(message);

            //input 
            String input = scanner.nextLine().trim();

            //check input matches with valid
            //if input matches valid => true => return input
            if (input.matches(valid)) {
                return input;
                //else => false => tell error
            } else {
                System.out.println(errorString);
            }

        }
    }

    public static int getInt(String message, String error, int min, int max) {
        while (true) {
            try {
                System.out.println(message);
                int number = Integer.parseInt(scanner.nextLine());

                //check number in range min -> max
                if (number > max || number < min) {
                    System.out.println("Number must in range " + min + " -> " + max);
                } else {
                    return number;
                }
            } catch (NumberFormatException e) {
                System.out.println(error);
            }
        }
    }

    public static float getFloat(String message, String error, float min, float max) {
        while (true) {
            try {
                System.out.println(message);
                float number = Float.parseFloat(scanner.nextLine());

                //kiem tra số trong khoảng min - max
                if (number > max || number <= min) {
                    System.out.println("Number must in range " + min + " -> " + max);
                } else {
                    return number;
                }
            } catch (NumberFormatException e) {
                System.out.println(error);
            }
        }
    }
}
