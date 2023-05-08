/*
_________________________________________________________________________________________________________
Alexa has two stacks of non-negative integers, stack  and stack  where index  denotes the top of the stack. Alexa challenges Nick to play the following game:

In each move, Nick can remove one integer from the top of either stack  or stack .
Nick keeps a running sum of the integers he removes from the two stacks.
Nick is disqualified from the game if, at any point, his running sum becomes greater than some integer  given at the beginning of the game.
Nick's final score is the total number of integers he has removed from the two stacks.
Given , , and  for  games, find the maximum possible score Nick can achieve.

Example


The maximum number of values Nick can remove is . There are two sets of choices with this result.

Remove  from  with a sum of .
Remove  from  and  from  with a sum of .
Function Description
Complete the twoStacks function in the editor below.

twoStacks has the following parameters: - int maxSum: the maximum allowed sum
- int a[n]: the first stack
- int b[m]: the second stack

Returns
- int: the maximum number of selections Nick can make

Input Format

The first line contains an integer,  (the number of games). The  subsequent lines describe each game in the following format:

The first line contains three space-separated integers describing the respective values of  (the number of integers in stack ),  (the number of integers in stack ), and  (the number that the sum of the integers removed from the two stacks cannot exceed).
The second line contains  space-separated integers, the respective values of .
The third line contains  space-separated integers, the respective values of .
_________________________________________________________________________________________________________
 */

import java.util.Arrays;
import java.util.Scanner;

public class GameOfTwoStacks {
    static int twoStacks(int x, int[] a, int[] b){
        return twoStacks(x, a, b, 0, 0) - 1;
    }
    private static int twoStacks(int x, int[] a, int[] b, int sum, int count){
        if(sum > x){
            return count;
        }
        if(a.length == 0 || b.length == 0){
            return count;
        }

        int ans1 = twoStacks(x, Arrays.copyOfRange(a, 1, a.length), b, sum+a[0], count+1);
        int ans2 = twoStacks(x, a, Arrays.copyOfRange(b, 1, b.length), sum+b[0], count+1);

        return Math.max(ans1, ans2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        for(int i=0; i<testCase; i++){
            int n = input.nextInt();
            int m = input.nextInt();
            int x = input.nextInt();

            int[] a = new int[n];
            int[] b = new int[m];
            for(int j=0; j<n; j++){
                a[j] = input.nextInt();
            }
            for(int j=0; j<m; j++){
                b[j] = input.nextInt();
            }
            input.close();
            System.out.println(twoStacks(x, a, b));
        }
    }
}

/*
Input:
1
5 4 10
4 2 4 6 1
2 1 8 5

Output:
4
 */
