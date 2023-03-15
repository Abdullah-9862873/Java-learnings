/*
    *
    **
    ***
    ****
    *****           row = n         row = 5     n = 5
    ****            row = 6         stars = 4       
    ***             row = 7         stars = 3
    **              row = 8         stars = 2
    *               row = 9         start = 1
*/

public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        int colReverseCount = n;

        boolean forward = true;

        for (int row = 1; row <= 2 * n - 1; row++) {
            if (forward) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
                System.out.println();
                if (row == 5) {
                    forward = false;
                }
            }
            if (!forward) {
                colReverseCount--;
                for (int col = colReverseCount; col >= 1; col--) {
                    System.out.print("* ");
                }
                if (colReverseCount != 0) {
                    System.out.println();
                }
            }
        }
    }
}
