/*
 * * * * *  space=0 --- stars=5 --- space=0 --- row=1 --- col=5 --- n=5
  * * * *   space=1 --- stars=4 --- space=1 --- row=2 --- col=5 --- n=5
   * * *    space=2 --- stars=3 --- space=2 --- row=3 --- col=5 --- n=5
    * *     space=3 --- stars=2 --- space=3 --- row=4 --- col=5 --- n=5
     *      space=4 --- stars=1 --- space=4 --- row=5 --- col=5 --- n=5
*/
public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            int space = row - 1;
            // For space
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
        }
    }
}
