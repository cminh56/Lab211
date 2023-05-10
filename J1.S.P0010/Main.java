

import java.util.Arrays;


public class Main {

   

    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();

        //input number of array ( number phai la so nguyen duong)
        System.out.println("Enter number of array: ");
        int number = Validate.checkInputInt();
        //create array
        int[] array = new int[number];
        
        //input search number
        System.out.println("Enter search value: ");
        int searchNumber = Validate.checkInputInt();
        
        //create random number for elements
        linearSearch.randomElement(array);
        
        //show array
        System.out.println("The array: " + Arrays.toString(array));
        
        //search numer
        linearSearch.search(array, searchNumber);


    }
}