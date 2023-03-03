
import java.util.Arrays;
import java.util.Scanner;

public class PracticeTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = input.nextInt();

        System.out.println("Enter the number of cols: ");
        int cols = input.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the value of row " + (i + 1) + " col " + (j + 1) + ": ");
                arr[i][j] = input.nextInt();
            }
        }

        input.close();

        // Output
        // for (int[] a : arr) {
        // System.out.println(Arrays.toString(a));
        // }

        // Output
        // for (int i = 0; i < rows; i++) {
        // System.out.println(Arrays.toString(arr[i]));
        // }

        // Output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
