public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        int count = 0;
        int ans = placeKnights(board, 0, 0, n, count);
        System.out.println(ans);
    }

    static int placeKnights(boolean[][] board, int row, int col, int knights, int count){
        if(knights == 0){
            display(board);
            System.out.println();
            return count + 1;
        }

        if(row == board.length-1 && col==board.length-1){
            return count;
        }

        if(col == board.length){
            return placeKnights(board, row+1, 0, knights, count);
        }

        if(isSafe(board, row, col)){
            board[row][col] = true;
            count = placeKnights(board, row, col+1, knights-1, count);
            board[row][col] = false;
        }

        count = placeKnights(board, row, col+1, knights, count);
        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col){
        // First condition check for r+2, c-1
        if(isValid(board, row+2, col-1)){
            if(board[row+2][col-1]){
                return false;
            }
        }
    
        // Second condition check for r+2, c+1
        if(isValid(board, row+2, col+1)){
            if(board[row+2][col+1]){
                return false;
            }
        }
    
        // Third condition check for r-2, c-1
        if(isValid(board, row-2, col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
    
        // Fourth condition check for r-2, c+1
        if(isValid(board, row-2, col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
    
        // Fifth condition check for r-1, c+2
        if(isValid(board, row-1, col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
    
        // Sixth condition check for r+1, c+2
        if(isValid(board, row+1, col+2)){
            if(board[row+1][col+2]){
                return false;
            }
        }
    
        // Seventh condition check for r-1, c-2
        if(isValid(board, row-1, col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
    
        // Eighth condition check for r+1, c-2
        if(isValid(board, row+1, col-2)){
            if(board[row+1][col-2]){
                return false;
            }
        }
    
        return true;
    }

    static boolean isValid(boolean[][] board, int row, int col){
        if(row >=0 && row<board.length && col>=0 && col<board.length){
            return true;
        }
        return false;
    }

    static void display(boolean[][] board) {
        for (boolean[] arr : board) {
            for (boolean element : arr) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
