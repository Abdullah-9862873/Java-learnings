/*
Given a positive integer n, find and return the longest distance between any two adjacent 1's in the binary representation of n. If there are no two adjacent 1's, return 0.

Two 1's are adjacent if there are only 0's separating them (possibly no 0's). The distance between two 1's is the absolute difference between their bit positions. For example, the two 1's in "1001" have a distance of 3.

 

Example 1:

Input: n = 22
Output: 2
Explanation: 22 in binary is "10110".
The first adjacent pair of 1's is "10110" with a distance of 2.
The second adjacent pair of 1's is "10110" with a distance of 1.
The answer is the largest of these two distances, which is 2.
Note that "10110" is not a valid pair since there is a 1 separating the two 1's underlined.

*/
package New;

public class BinaryGap {
    public static void main(String[] args) {
        int n = 22;

        String binary = Integer.toBinaryString(n);

        int j = 2;
        int firstPointer = binary.length();
        int secondPointer = binary.length();
        int ans = Integer.MIN_VALUE;

        for (int i = binary.length() - 1; i >= 1; i--) {
            int mask = 1 << (binary.length() - j);
            j++;

            String bin = Integer.toBinaryString(mask);
            secondPointer = bin.length();

            if ((n & mask) != 0) {
                int val = firstPointer - secondPointer;
                ans = Math.max(ans, val);
                firstPointer = secondPointer;
            }
        }

        if (Integer.bitCount(n) == 1) {
            ans = 0;
        }
        System.out.println(ans);

    }
}
