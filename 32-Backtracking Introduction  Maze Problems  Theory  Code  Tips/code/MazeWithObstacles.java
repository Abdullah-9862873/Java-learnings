import java.util.ArrayList;
import java.util.List;

/*
Question is that you have a matrix of 3x3 and at (2,2) there is a which you cannot cross so how many ways are there that a person can go from (3,3) to (1,1)
 */
public class MazeWithObstacles {
    public static void main(String[] args) {
        // printMazePath("", 3, 3);

        // System.out.println(countMazePaths(3, 3));

        // List<String> ans = mazePathWithObstacleReturn("", 3, 3);
        // System.out.println(ans);

        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };

        // mazePathWithObstacleReturn2("", maze, 0, 0);
        List<String> ans =  mazePathWithObstacleReturn3("", maze, 0, 0);
        System.out.println(ans);
    }

    static void printMazePath(String processed,int r, int c){
        if(r==1 && c==1){
            System.out.println(processed);
            return;
        }

        if(r == 2 && c==2){
            return;
        }
        if(r > 1){
            printMazePath(processed+'R', r-1, c);
        }
        if(c > 1){
            printMazePath(processed+'D', r, c-1);
        }
    }

    static int countMazePaths(int r, int c){
        if(r==1 && c==1){
            return 1;
        }

        int count = 0;
        if(r==2 && c==2){
            return 0;
        }

        if(r > 1){
            count = count + countMazePaths(r-1, c);
        }
        if(c > 1){
            count = count + countMazePaths(r, c-1);
        }
        return count;
    }

    static List<String> mazePathWithObstacleReturn(String processed, int r, int c){
        if(r==1 && c==1){
            List<String> list= new ArrayList<>();
            list.add(processed);
            return list;
        }
        List<String> vertical = new ArrayList<>();
        List<String> horizontal = new ArrayList<>();
        List<String> diagonal = new ArrayList<>();

        if(r==2 && c==2){
            return diagonal;
        }
        if(r > 1){
            horizontal = mazePathWithObstacleReturn(processed+'H', r-1, c);
        }
        if(c > 1){
            vertical = mazePathWithObstacleReturn(processed+'V', r, c-1);
        }

        vertical.addAll(diagonal);
        vertical.addAll(horizontal);
        return vertical;
    }

    // What if we start fron (0,0) rather than (3,3)
    static void mazePathWithObstacleReturn2(String processed, boolean[][] maze, int r, int c){
        if(r==(maze.length-1) && c==(maze[0].length-1)){
            System.out.println(processed);
            return;
        }

        if(!maze[r][c]){
            return;
        }
        if(r < maze.length-1){
            mazePathWithObstacleReturn2(processed+'R', maze, r+1, c);
        }
        if(c < maze[0].length-1){
            mazePathWithObstacleReturn2(processed+'D', maze, r, c+1);
        }

        return;
    }
    static List<String> mazePathWithObstacleReturn3(String processed, boolean[][] maze, int r, int c){
        if(r==(maze.length-1) && c==(maze[0].length-1)){
            List<String> list= new ArrayList<>();
            list.add(processed);
            return list;
        }
        List<String> vertical = new ArrayList<>();
        List<String> horizontal = new ArrayList<>();
        List<String> diagonal = new ArrayList<>();

        if(!maze[r][c]){
            return diagonal;
        }
        if(r < maze.length-1){
            horizontal = mazePathWithObstacleReturn3(processed+'H',maze, r+1, c);
        }
        if(c < maze[0].length-1){
            vertical = mazePathWithObstacleReturn3(processed+'V', maze, r, c+1);
        }

        vertical.addAll(diagonal);
        vertical.addAll(horizontal);
        return vertical;
    }

    
}
