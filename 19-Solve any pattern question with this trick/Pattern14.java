/*
     *********
      *     *
       *   *
        * *
         *
*/
public class Pattern14 {
    public static void main(String[] args) {
        int n = 5;
        int reverseCount = n;

        for (int row = 1; row <= n; row++) {
            // For space
            int space = row - 1;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // For stars
            int stars = 1;
            if (row == 1) {
                stars = 2 * n - 1;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // space after stars
            if (row > 1 && row < n) {
                space = reverseCount;
                if (reverseCount >= 3) {
                    reverseCount -= 2;
                }

                for (int j = 1; j <= space; j++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            System.out.println();
        }
    }
}
