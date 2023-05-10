

import java.util.Arrays;


public class Main {

   

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();

        //input number of array ( number phai la so nguyen duong)
        System.out.println("Enter number of array: ");
        int number = Validate.checkInputInt();
        //create array
        int[] a = new int[number];
        
        //input search number
        System.out.println("Enter search value: ");
        int searchNumber = Validate.checkInputInt();
        
        //create random number for elements
        binarySearch.randomElement(a);
        
        //sort array
        binarySearch.Sort(a);
        
        //show array
        System.out.println("The array: " + Arrays.toString(a));
        
        //search numer
      
if (binarySearch.binarySearch(a, searchNumber) == -1 ){
    System.out.println("Not Found!");
}
else System.out.println("Found " + searchNumber + " at index "  + binarySearch.binarySearch(a, searchNumber));

    }
}