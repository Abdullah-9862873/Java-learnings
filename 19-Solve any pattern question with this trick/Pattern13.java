/*
         *      4 spaces --- 1 star --- 4 spaces --- row 1 --- col 1 --- n 5
        * *     3 spaces --- 1 star --- 1space --- 1star --- 3 spaces --- row 1 --- col 1 --- n 5
       *   *    2 spaces --- 1 star --- 3space --- 1star --- 2 spaces --- row 1 --- col 1 --- n 5
      *     *   1 spaces --- 1 star --- 5space --- 1star --- 1 spaces --- row 1 --- col 1 --- n 5
     *********  0 spaces --- 2*n-1 star --- 0 space --- row 1 --- col 1 --- n 5
*/

public class Pattern13 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            // For space
            int space = n - row;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // For stars
            System.out.print("*");
            // For space after stars
            if (row > 1 && row < n) {
                space = 2 * (row - 1) - 1;
                for (int j = 1; j <= space; j++) {
                    System.out.print(" ");
                }

                // stars after spacing in rows from >1 to <n
                System.out.print("*");
            }

            // For stars in the last row
            if (row == n) {
                for (int j = 1; j <= 2 * n - 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}