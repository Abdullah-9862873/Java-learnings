import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int row = input.nextInt();

        System.out.println("Enter the number of columns: ");
        int col = input.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        // output
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

        System.out.println("Enter the row number of the element you want to print: ");
        int outputRow = input.nextInt();
        outputRow -= 1;

        System.out.println("Enter the position of the element you want to print: ");
        int outputColPosition = input.nextInt();
        outputColPosition -= 1;

        System.out.print("The element you are looking for is: " + arr[outputRow][outputColPosition]);

        input.close();
    }
}
