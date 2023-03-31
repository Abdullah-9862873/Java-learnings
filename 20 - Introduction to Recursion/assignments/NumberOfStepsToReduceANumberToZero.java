/*
Given an integer num, return the number of steps to reduce it to zero.

In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

 

Example 1:

Input: num = 14
Output: 6
Explanation: 
Step 1) 14 is even; divide by 2 and obtain 7. 
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3. 
Step 4) 3 is odd; subtract 1 and obtain 2. 
Step 5) 2 is even; divide by 2 and obtain 1. 
Step 6) 1 is odd; subtract 1 and obtain 0.

*/
public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        int num = 14;
        int ans = countSteps(num, 0);
        System.out.println(ans);
    }

    static int countSteps(int n, int steps) {
        if (n == 0) {
            return steps;
        }
        if (isEven(n)) {
            return countSteps(n / 2, steps + 1);
        }
        return countSteps(n - 1, steps + 1);
    }

    static boolean isEven(int n) {
        if ((n & 1) == 0) {
            return true;
        }
        return false;
    }
}
