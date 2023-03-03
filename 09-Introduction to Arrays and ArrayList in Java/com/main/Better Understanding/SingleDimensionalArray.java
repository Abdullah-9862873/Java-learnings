import java.util.Arrays;
import java.util.Scanner;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        // input
        System.out.println("Enter the values of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        // output
        System.out.println(Arrays.toString(arr));
        input.close();
    }
}