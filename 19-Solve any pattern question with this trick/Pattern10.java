/*
    *       space = 4 ---- stars = 1 ---- space = 4 ---- row = 1 ---- col = 9
   * *      space = 3 ---- stars = 2 ---- space = 3 ---- row = 1 ---- col = 9    
  * * *     space = 2 ---- stars = 3 ---- space = 2 ---- row = 1 ---- col = 9
 * * * *    space = 1 ---- stars = 4 ---- space = 1 ---- row = 1 ---- col = 9
* * * * *   space = 0 ---- stars = 5 ---- space = 0 ---- row = 1 ---- col = 9
*/
public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            // For space
            int space = n - row;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // For stars
            for (int j = 1; j <= row; j++) {
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
