

public class Main {



    public static void main(String[] args) {

        int n = SelectionSort.inputSizeOfArray(); // nhap length cua mang
        int[] a = new int[n];

        SelectionSort.randomElement(a); // sinh ra cac phan tu ngau nhien
        System.out.print("Unsorted array: ");
        SelectionSort.print(a); // in mang chua sap xep
        SelectionSort.Sort(a); //sap xep mang

        System.out.print("\nSorted array: ");
        SelectionSort.print(a); // in mang da sap xep
    }

}
