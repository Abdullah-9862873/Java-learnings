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
package New;

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        int n = 14;

        int steps = 0;
        while (n > 0) {
            if (isEven(n)) {
                n = n / 2;
                steps++;
            }
            if (!isEven(n)) {
                n = n - 1;
                steps++;
            }
        }
        System.out.println(steps);

    }

    static boolean isEven(int n) {
        if (n == 0) {
            return true;
        }
        if ((n & 1) == 1) {
            return false;
        }
        return true;
    }
}
