import java.util.ArrayList;
import java.util.List;

public class MazeProblem{
    public static void main(String[] args) {
        // int ans = countNumberOfWaysToReachEnd(3, 3);
        // System.out.println(ans);

        // printPathsOfMaze("", 3, 3);

        // List<String> ans = mazePathReturn("", 3,3);
        // System.out.println(ans);

        List<String> ans = mazePathReturn2("", 3, 3);
        System.out.println(ans);
    }

    static int countNumberOfWaysToReachEnd(int r, int c){
        if(r==1 || c == 1){
            return 1;
        }
        int left = countNumberOfWaysToReachEnd(r-1, c);
        int right = countNumberOfWaysToReachEnd(r, c-1);
        return left+right;
    }

    static void printPathsOfMaze(String processed, int r, int c){
        if(r==1 && c==1){
            System.out.println(processed);
            return;
        }

        char right = 'R';
        char down = 'D';
        
        if(c>1){
            printPathsOfMaze(processed+down, r, c-1);
        }
        if(r > 1){
            printPathsOfMaze(processed+right, r-1, c);
        }
    }

    static List<String> mazePathReturn(String processed, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        List<String> leftSide = new ArrayList<>();
        List<String> rightSide = new ArrayList<>();
        if(c > 1){
            rightSide = mazePathReturn(processed+'D', r, c-1);
        }
        if(r > 1){
            leftSide = mazePathReturn(processed+'R', r-1, c);
        }

        leftSide.addAll(rightSide);
        return leftSide;
    }

    static List<String> mazePathReturn2(String processed, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        List<String> leftSide = new ArrayList<>();
        List<String> rightSide = new ArrayList<>();
        List<String> diagonalSide = new ArrayList<>();
        if(c > 1){
            rightSide = mazePathReturn2(processed+'V', r, c-1);
        }
        if(r > 1){
            leftSide = mazePathReturn2(processed+'H', r-1, c);
        }
        if((r > 1) && (c > 1)){
            diagonalSide = mazePathReturn2(processed+'D', r-1, c-1);
        }

        leftSide.addAll(rightSide);
        leftSide.addAll(diagonalSide);
        return leftSide;
    }
    // v -> Vertical
    // H -> Horizontal
    // D -> Diagonal
}

/*
________________________________________________________________________________
The countNumberOfWaysToReachEnd shows that the number of ways to solve a maze containing this much rows and columns
________________________________________________________________________________
In "countNumberOfWaysToReachEnd", "printPathsOfMaze", "mazePathReturn" I have solved the maze problem that has a condition that a man can only move right and down.

________________________________________________________________________________
In "mazePathReturn2" you can move diagonally too
 */