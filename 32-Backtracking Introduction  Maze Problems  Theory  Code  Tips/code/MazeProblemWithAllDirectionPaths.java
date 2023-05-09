import java.util.Arrays;

public class MazeProblemWithAllDirectionPaths{
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };

        int[][] path = new int[maze.length][maze[0].length];
        printAllPaths2("", maze, 0, 0, path, 1);

    }

    static void printAllPaths(String processed, boolean[][] maze, int r, int c){
        if(r== maze.length-1 && c == maze[0].length-1){
            System.out.println(processed);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        // If maze[r][c] is true then that means I am considering that block in my path
        maze[r][c] = false;

        if(r < maze.length-1){
            maze[r][c] = false;
            printAllPaths(processed+'R', maze, r+1, c);
        }
        if(c < maze[0].length -1){
            maze[r][c] = false;
            printAllPaths(processed+'D', maze, r, c+1);
        }
        if(r > 0){
            printAllPaths(processed+'L', maze, r-1, c);
        }
        if(c > 0){
            printAllPaths(processed+'U', maze, r, c-1);
        }

        // This line is where the function will be over
        // So before the function gets removed also remove the changes made by that function
        maze[r][c] = true;
    }

    static void printAllPaths2(String processed, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r==maze.length-1 && c == maze[0].length-1){
            path[r][c] = step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(processed);
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;
        }

        // If I am allowed to take that path then first I will mark that path that that particular path is included in the processed
        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length-1){
            printAllPaths2(processed+'D', maze, r+1, c, path, step+1);
        }
        if(c < maze[0].length-1){
            printAllPaths2(processed+'R', maze, r, c+1, path, step+1);
        }
        if(r > 0){
            printAllPaths2(processed+'U', maze, r-1, c, path, step+1);
        }
        if(c > 0){
            printAllPaths2(processed+'L', maze, r, c-1, path, step+1);
        }

        // After I have taken the answers in the processed I have to remove the paths too
        maze[r][c] = true;
        path[r][c] = 0;
    }
}

/*
______________________________________________________________________________
Thought process of backtracking is to simply
---> Make a change, in this case I have marked the paths visited by that function call only, to false
---> After the work is done, In this case when I have gotten the answer in my processed
---> Revert the change, In this case I have again made it true as if I don't then it will stay false, and will prevent the further paths to go to same block so while returing I have to revert it
______________________________________________________________________________
 */
