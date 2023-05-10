

public class Main {



    public static void main(String[] args) {

        int n = InsectionSort.inputSizeOfArray(); // nhap length cua mang
        int[] a = new int[n];

        InsectionSort.randomElement(a); // sinh ra cac phan tu ngau nhien
        System.out.print("Unsorted array: ");
        InsectionSort.print(a); // in mang chua sap xep
        InsectionSort.Sort(a); //sap xep mang

        System.out.print("\nSorted array: ");
        InsectionSort.print(a); // in mang da sap xep
    }

}
