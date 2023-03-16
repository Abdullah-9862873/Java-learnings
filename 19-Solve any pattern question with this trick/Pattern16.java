/*
              1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1
*/
public class Pattern16 {
    public static void main(String[] args) {
        int row = 5;
        int col = row;
        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
