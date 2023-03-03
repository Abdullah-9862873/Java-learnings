import java.util.Scanner;
import java.util.ArrayList;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list2D = new ArrayList<ArrayList<Integer>>(10);

        System.out.println("How many Array lists you want in the whole arraylist: ");
        int noOfAL = input.nextInt();

        for (int i = 0; i < noOfAL; i++) {
            list2D.add(new ArrayList<>());
        }

        // input in multidimensional array lists
        for (int i = 0; i < noOfAL; i++) {
            System.out.println("How many number of columns you want in the array list " + (i + 1) + ": ");
            int col = input.nextInt();
            for (int j = 0; j < col; j++) {
                System.out.println("Enter value " + (j + 1) + ": ");
                list2D.get(i).add(input.nextInt());
            }
        }

        input.close();

        // output
        System.out.println("Following is the 2D array that you entered: ");
        // System.out.println(list2D);
        for (ArrayList<Integer> row : list2D) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
