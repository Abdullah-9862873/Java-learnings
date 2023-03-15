/*
    *****
    ****
    ***
    **
    *
*/
public class Pattern3 {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            int col = 5;
            col = col - row + 1;
            while (col >= 1) {
                System.out.print("* ");
                col--;
            }
            System.out.println();
        }
    }
}
