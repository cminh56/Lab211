
import java.util.Arrays;
import java.util.Random;


public class QuickSort {
    
    
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
   
    public static int partition(int[] a, int l, int r){
        // i tim kiem nhung phan tu lon hon hoac bang phan tu o giua
        int pivot = a[(l + r)/2] , i = l, j = r; // chon pivot la phan tu o giua
        while(i <= j){ 
            
            while(a[i] < pivot) // i tim kiếm những phần tử >= pivot
                i++;
            while(a[j] > pivot) //j tim kiếm những phần tử <= pivot
                j--;
            
            // swap 2 phần tử vừa tìm được
            if( i <= j){
                int temp = a[i];
                a[i] = a[j];
                a[j]= temp;
                i++;
                j--;
            }
        }
        return i;
    }
     
   
    public static void quickSort(int []a, int l, int r){
    int i = partition(a, l ,r);
    if(l < i - 1)
        quickSort(a, l, i - 1); // sort mảng trái
    if(i < r)
        quickSort(a, i ,r);  // sort mảng phải
}
    
    
    
    // Merge hai mảng con của arr[].
    // Mảng con thứ nhất là arr[l..m]
    // Mảng con thứ hai là arr[m+1..r]
    void merge(int[] a, int l, int m, int r) {

        // Tìm kích thước của 2 mảng con để merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Tạo mảng tạm
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy dữ liệu vào mảng tạm
        for (int i = 0; i < n1; ++i)
            L[i] = a[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = a[m + 1 + j];

        // Merge các mảng tạm lại

        // Chỉ mục ban đầu của 2 mảng con
        int i = 0, j = 0;

        // Chỉ mục ban đầu của mảng phụ được hợp nhất
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
            k++;
        }

        // Sao chép các phần tử còn lại của L[] nếu có
        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }

        // Sao chép các phần tử còn lại của R[] nếu có
        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int[] a, int l, int r) {
        if (l < r) {

            // Tìm điểm chính giữa
            int m = (l + r) / 2;

            // Hàm đệ quy tiếp tục chia đôi
            sort(a, l, m);
            sort(a, m + 1, r);

            merge(a, l, m, r);
        }
    }
    
    
    
    // in mang
    public static void print(int[] a) {
               System.out.println(Arrays.toString(a));

    }

    
}
