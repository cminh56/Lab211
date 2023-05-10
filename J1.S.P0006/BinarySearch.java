
import java.util.Random;

public class BinarySearch {

    void randomElement(int[] a) {
        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            //sinh ra cac so ngau nhien va gasn vao cac phan tu mang
            a[i] = random.nextInt(a.length);

        }
    }

    //sort mang
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

    int binarySearch(int[] a, int x) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = (r + l) / 2; // tinh vi tri chinh giữa

            // kiểm tra xem x có ở chính giữa không
            if (a[m] == x) {
                return m;
            }

            // Nếu x lớn hơn, bỏ qua nửa bên trái
            if (a[m] < x) {
                l = m + 1;
            } // Nếu x nhỏ hơn, bỏ qua nửa bên phải
            else {
                r = m - 1;
            }
        }

        // phần tử không tồn tại
        return -1;
    }

}
