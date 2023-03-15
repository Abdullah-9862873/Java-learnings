/*
         *          row = 1 space = n-row   5-1
        **          row = 2 space = n-row   5-2       
       ***          row = 3 space = n-row   5-3
      ****          row = 4 space = n-row   5-4
     *****          row = 5 space = n-row   5-5      
*/

public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        int space = n;
        for (int row = 1; row <= n; row++) {
            space = n - row;
            for (int col = 1; col <= n; col++) {
                // For space
                if (space >= 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                space--;
            }
            System.out.println();
        }
    }
}
