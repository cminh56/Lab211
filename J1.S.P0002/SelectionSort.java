
import java.util.Arrays;
import java.util.Random;


public class SelectionSort {
    
    
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

        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (a[j] < a[min_idx])
                    min_idx = j;

            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }
    }
    
    // in mang
    public static void print(int[] a) {
               System.out.println(Arrays.toString(a));

    }
}
