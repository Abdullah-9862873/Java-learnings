/*
         1
        212
       32123
      4321234
       32123
        212
         1

*/

public class Pattern17 {
    public static void main(String[] args) {
        int n = 5;
        boolean forward = true;
        int reverse = n - 2;

        for (int row = 1; row <= 2 * n - 3; row++) {
            if (row == n) {
                forward = false;
                reverse = n - 2;
            }
            if (forward) {

                // For space
                int space = n - row;
                for (int j = 1; j <= space; j++) {
                    System.out.print(" ");
                }

                for (int j = row; j >= 1; j--) {
                    System.out.print(j);
                }

                for (int j = 2; j <= row; j++) {
                    System.out.print(j);
                }
            }
            if (!forward) {
                // For space
                int space = row - n;
                if (row == n) {
                    space = 2;
                } else {
                    space = row - n + reverse;
                }
                for (int j = 1; j <= space; j++) {
                    System.out.print(" ");
                }

                if (reverse > 1) {

                    for (int j = reverse; j >= 1; j--) {
                        System.out.print(j);
                    }
                    for (int j = 2; j <= reverse; j++) {
                        System.out.print(j);
                    }
                }
                if (reverse == 1) {
                    System.out.print(" " + reverse);
                }
                reverse--;
            }
            System.out.println();
        }
    }
}
