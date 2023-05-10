

public class Main {



    public static void main(String[] args) {

        int n = BubbleSort.inputSizeOfArray(); // nhap length cua mang
        int[] a = new int[n];

        BubbleSort.randomElement(a); // sinh ra cac phan tu ngau nhien
        System.out.print("Unsorted array: ");
        BubbleSort.print(a); // in mang chua sap xep
        BubbleSort.sort(a); //sap xep mang

        System.out.print("\nSorted array: ");
        BubbleSort.print(a); // in mang da sap xep
    }

}
