/*
You are given an integer n and an integer start.

Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length.

Return the bitwise XOR of all elements of nums.

 

Example 1:

Input: n = 5, start = 0
Output: 8
Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
Where "^" corresponds to bitwise XOR operator.

*/
package New;

public class XOROperationInArray {
    public static void main(String[] args) {
        int n = 5;
        int start = 0;

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
        }

        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        System.out.println(ans);
    }
}
