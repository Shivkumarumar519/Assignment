import java.util.Arrays;
import java.util.Random;

public class shuffle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        System.out.println("Initial array: " + Arrays.toString(arr));
        Random rand = new Random();
        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        System.out.println("Shuffled array: " + Arrays.toString(arr));
    }
}
