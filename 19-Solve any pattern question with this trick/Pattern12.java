/*
* * * * *   space=0 --- stars=5 --- space=0 --- row=1 --- col=2*n-1=9 --- n=5
 * * * *    space=1 --- stars=4 --- space=1 --- row=2 --- col=2*n-1=9 --- n=5
  * * *     space=2 --- stars=3 --- space=2 --- row=3 --- col=2*n-1=9 --- n=5
   * *      space=3 --- stars=2 --- space=3 --- row=4 --- col=2*n-1=9 --- n=5
    *       space=4 --- stars=1 --- space=4 --- row=5 --- col=2*n-1=9 --- n=5
    *       space=4 --- stars=1 --- space=4 --- row=6 --- col=2*n-1=9 --- n=5
   * *      space=3 --- stars=2 --- space=3 --- row=7 --- col=2*n-1=9 --- n=5
  * * *     space=2 --- stars=3 --- space=2 --- row=8 --- col=2*n-1=9 --- n=5
 * * * *    space=2 --- stars=4 --- space=1 --- row=9 --- col=2*n-1=9 --- n=5
* * * * *   space=0 --- stars=5 --- space=0 --- row=10 --- col=2*n-1=9 --- n=5
 */
public class Pattern12 {
    public static void main(String[] args) {
        int n = 5;
        boolean forward = true;
        int countBack = n;

        for (int row = 1; row <= 2 * n; row++) {
            if (countBack <= 0) {
                forward = false;
            }
            // For forward

            if (forward) {

                // For space
                int space = row - 1;
                for (int j = 1; j <= space; j++) {
                    System.out.print(" ");
                }
                // For stars
                int stars = n - row + 1;
                for (int j = 1; j <= stars; j++) {
                    System.out.print("* ");
                }
                // For space
                for (int j = 1; j <= space; j++) {
                    System.out.print(" ");
                }
                System.out.println();
                countBack--;
            } else {

                // For backward

                // For space
                int space = n - (row - n);
                for (int j = 1; j <= space; j++) {
                    System.out.print(" ");
                }

                // For stars
                int stars = row - n;
                for (int j = 1; j <= stars; j++) {
                    System.out.print("* ");
                }

                // For space
                for (int j = 1; j <= space; j++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

    }
}
