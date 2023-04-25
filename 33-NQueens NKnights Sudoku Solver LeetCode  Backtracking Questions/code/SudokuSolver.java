public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
                { 0, 0, 3, 0, 2, 0, 6, 0, 0 },
                { 9, 0, 0, 3, 0, 5, 0, 0, 1 },
                { 0, 0, 1, 8, 0, 6, 4, 0, 0 },
                { 0, 0, 8, 1, 0, 2, 9, 0, 0 },
                { 7, 0, 0, 0, 0, 0, 0, 0, 8 },
                { 0, 0, 6, 7, 0, 8, 2, 0, 0 },
                { 0, 0, 2, 6, 0, 9, 5, 0, 0 },
                { 8, 0, 0, 2, 0, 3, 0, 0, 9 },
                { 0, 0, 5, 0, 1, 0, 3, 0, 0 },
        };

        if(solveThisSudoko(board)){
            display(board);
        }else{
            System.out.println("This sudoku cannot be solved");
        }
    }

    static boolean solveThisSudoko(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean isEmpty = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    // I have found a block empty
                    isEmpty = false;
                    break;
                }
            }

            // If you have found an empty box in the ith row then no need to check further
            // rows you can simply return
            if (isEmpty == false) {
                break;
            }
        }
        if (isEmpty) {
            // Sudoku has been solved
            return true;
        }

        // If empty space is found and sudoku is not solved then start putting the
        // numbers
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                // Check again if the sudoku has been solved yet or not
                if (solveThisSudoko(board)) {
                    // Sudoku is solved you can return
                    return true;
                }
            } else {
                // If it is not the safe place then again make that block empty
                board[row][col] = 0;
            }
        }

        // Otherwise Sudoku cannot be solved
        return false;
    }

    static boolean isSafe(int[][] board, int row, int col, int num) {
        // Check that the num can be placed in the box or not

        // Checking in the row
        for (int r = 0; r < board.length; r++) {
            if (board[r][col] == num) {
                return false;
            }
        }

        // Checking in the col
        for (int[] nums : board) {
            if (nums[col] == num) {
                return false;
            }
        }

        // Checking in the 3x3 boxes
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int i = rowStart; i < sqrt; i++) {
            for (int j = colStart; j < sqrt; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    static void display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
