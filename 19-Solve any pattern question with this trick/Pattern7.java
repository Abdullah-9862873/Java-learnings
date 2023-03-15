/*
    *****       space=0     row=1       col=1       n=5
     ****       space=1     row=2       col=2       n=5
      ***       space=2     row=3       col=3       n=5
       **       space=3     row=4       col=4       n=5
        *       space=4     row=5       col=5       n=5
*/

public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        int space = 0;
        int stars = 0;

        for (int row = 1; row <= n; row++) {
            space = row - 1;
            stars = n - row + 1;

            for (int col = 1; col <= n; col++) {
                while (space != 0) {
                    System.out.print(" ");
                    space--;
                }
                while (stars >= 1) {
                    System.out.print("*");
                    stars--;
                }

            }
            System.out.println();
        }
    }
}
