/*
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

 

Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 6;

        boolean ans = checkPowerOfTwo(n);
        System.out.println(ans);
    }

    static boolean checkPowerOfTwo(int n) {
        // base case
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        // Processing
        boolean num = isEven(n);
        if (!num) {
            return false;
        }

        // Recurrence Relation
        return checkPowerOfTwo(n / 2);
    }

    static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        if (n == 0) {
            return true;
        }
        return false;
    }
}