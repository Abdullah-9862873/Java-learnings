/*
    *       4 spaces ---- 1 star ---- 4 spaces ---- 5 n ---- row 1 ---- col 9
   ***      3 spaces ---- 3 star ---- 3 spaces ---- 5 n ---- row 2 ---- col 9
  *****     2 spaces ---- 5 star ---- 2 spaces ---- 5 n ---- row 3 ---- col 9
 *******    1 spaces ---- 7 star ---- 1 spaces ---- 5 n ---- row 4 ---- col 9
*********   0 spaces ---- 9 star ---- 0 spaces ---- 5 n ---- row 5 ---- col 9

*/

public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            int space = n - row;
            // For first space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // For star
            int stars = 2 * row - 1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            // For space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
