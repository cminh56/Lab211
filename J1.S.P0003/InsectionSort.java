
import java.util.Arrays;
import java.util.Random;


public class InsectionSort {
    
    
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
   
     // sap xep theo selection sort
    public static void Sort(int[] a) {
         int n = a.length;
        for (int i = 1; i < n; ++i) {
            int cur = a[i]; // biến current xét
            int j = i - 1;  // ví trí trước current

            // Đẩy các phần tử > current ra đằng sau
            while (j >= 0 && a[j] > cur) {
                a[j + 1] = a[j];  // đẩy phần tử ra sau 1 nấc
                j = j - 1;
            a[j + 1] = cur;   // gắn tạm giá trị current cho đến khi a[j] < curent
        }
    }
    }
    
    // in mang
    public static void print(int[] a) {
               System.out.println(Arrays.toString(a));

    }
}
