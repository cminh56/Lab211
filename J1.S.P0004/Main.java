

public class Main {



    public static void main(String[] args) {

        int n = QuickSort.inputSizeOfArray(); // nhap length cua mang
        int[] a = new int[n];

        QuickSort.randomElement(a); // sinh ra cac phan tu ngau nhien
        System.out.print("Unsorted array: ");
        QuickSort.print(a); // in mang chua sap xep
        
        QuickSort.quickSort(a, 0, a.length-1); //sap xep mang
        

        System.out.print("\nSorted array: ");
       QuickSort.print(a); // in mang da sap xep
    }

}
