/*
         *      space 4 --- star 1 --- space 4 --- row 1 --- col 9 --- n 5
        * *     space 3 --- star 1 --- space 1 --- star 1 --- space 3 --- row 2 --- col 9 --- n 5
       *   *    space 2 --- star 1 --- space 3 --- star 1 --- space 2 --- row 2 --- col 9 --- n 5
      *     *   space 1 --- star 1 --- space 5 --- star 1 --- space 1 --- row 2 --- col 9 --- n 5
     *       *  space 0 --- star 1 --- space 7 --- star 1 --- space 0 --- row 2 --- col 9 --- n 5

      *     *   space 1 --- star 1 --- space 5 --- star 1 --- space 1 --- row 2 --- col 9 --- n 5
       *   *    space 2 --- star 1 --- space 3 --- star 1 --- space 2 --- row 2 --- col 9 --- n 5
        * *     space 3 --- star 1 --- space 1 --- star 1 --- space 3 --- row 2 --- col 9 --- n 5
         *      space 4 --- star 1 --- space 4 --- row 1 --- col 9 --- n 5
*/
public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        boolean forward = true;
        int reverseCount = 2 * n - 2;

        for (int row = 1; row < 2 * n - 1; row++) {

            if (forward) {

                // For spaces
                int space = n - row;
                for (int j = 1; j <= space; j++) {
                    System.out.print(" ");
                }

                // For stars
                System.out.print("*");

                // For space after stars
                if (row > 1 && row <= n) {
                    space = 2 * (row - 1) - 1;
                    for (int j = 1; j <= space; j++) {
                        System.out.print(" ");
                    }

                    // Star after space
                    System.out.print("*");
                }
            }
            if (row == n) {
                forward = false;
                System.out.println();
            }
            reverseCount--;

            if (!forward) {
                // For space
                int space = (row - n) + 1;
                if (row == n) {
                    space = 1;
                }
                for (int j = 1; j <= space; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");

                // space after stars
                if (row >= n && row < 2 * n - 2) {
                    space = 2 * reverseCount - 1;

                    for (int j = 1; j <= space; j++) {
                        System.out.print(" ");
                    }

                    // Star after space
                    System.out.print("*");

                }
            }

            System.out.println();
        }
    }
}
