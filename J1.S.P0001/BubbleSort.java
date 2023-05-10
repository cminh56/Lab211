
import java.util.Arrays;
import java.util.Random;



public class BubbleSort {
    // nhap so luong mang
   static int inputSizeOfArray() {
        System.out.print("Enter number of array: ");
        int n = Validate.checkInputInt();
        return n;
    }

    //Ham tao random
   public static void randomElement(int[] a) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            //sinh ra cac so ngau nhien va gasn vao cac phan tu mang
            a[i] = random.nextInt(a.length);  
        }
    }
    
    //ham sap xep
    public static void sort(int[] a) {
          int n = a.length;
         
       
      
        for (int i = 0; i < n - 1; i++)   
            for (int j = 0; j < n - i - 1; j++) // n-i-1: so lan so sanh
                if (a[j] > a[j + 1]) {
                    // swap array[j+1] and array[j]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
    }
     // in mang 
    public static void print(int[] a) {
               System.out.println(Arrays.toString(a));

    }
}