import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        Arrays.sort(array);
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan Element Array Ke " + (i) + " : ");
            array[i] = sc.nextInt();
        }
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println("Array Ke " + (i) + " : " + array[i] + " ");
        // }

        Arrays.sort(array);
        System.out.println("Ascending");
        for (int values : array) {
            System.out.print(values + ", ");
        }
        System.out.println("");
        System.out.println("Descending");
        Arrays.sort(array);
        reverse(array);
        for (int values : array) {
            System.out.print(values + ", ");
        }
        sc.close();

    }

    public static void reverse(int[] array)
    {
 
        // Length of the array
        int n = array.length;
 
        // Swapping the first half elements with last half
        // elements
        for (int i = 0; i < n / 2; i++) {
 
            // Storing the first half elements temporarily
            int temp = array[i];
 
            // Assigning the first half to the last half
            array[i] = array[n - i - 1];
 
            // Assigning the last half to the first half
            array[n - i - 1] = temp;
        }
    }
}
