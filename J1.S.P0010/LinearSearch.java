
import java.util.Random;


public class LinearSearch {
    
    
    
    
    void randomElement(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            //sinh ra cac so ngau nhien va gasn vao cac phan tu mang
            array[i] = random.nextInt(array.length);

        }
    }

    void search(int[] array, int searchNumber) {
        for (int i = 0; i < array.length; i++) {
            if(searchNumber == array[i]) {
                System.out.println("Found " + searchNumber + " at index " + i );
                //stop 
                return;
            }
            
        }System.out.println("Not found.");
    }
    
    
    
    
}