import java.util.Arrays;
import java.util.Scanner;

public class PracticeOneDimenstionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + (i + 1) + " value: ");
            arr[i] = input.nextInt();
        }
        input.close();

        // Output
        // System.out.println(Arrays.toString(arr));

        // Output
        // for (int i = 0; i < size; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // }
    }
}
