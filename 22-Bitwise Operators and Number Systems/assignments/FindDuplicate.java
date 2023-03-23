/*

Example 1:

Input: nums = [2,2,1]
Output: 2

*/

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1 };

        // Find the min and maximum element in array
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            min = Math.min(nums[i], min);
            max = Math.max(nums[i], max);
        }

        // Find the XOR from values from min to max
        int step1Ans = findXORInRange(min, max);

        // Find the XOR of all elements of the given array
        int step2Ans = 0;
        for (int i = 0; i < nums.length; i++) {
            step2Ans = step2Ans ^ nums[i];
        }

        // Have the XOR of two above stuff
        int finalAns = step1Ans ^ step2Ans;
        System.out.println(finalAns);

    }

    static int findXORInRange(int min, int max) {
        // Find the XOR till max
        int first = XOR(max);

        // Find the XOR from 0 to min-1
        int second = XOR(min - 1);

        // Have the XOR of first and second
        int ans = first ^ second;
        return ans;
    }

    static int XOR(int a) {
        int ans = 0;
        if (a % 4 == 0) {
            ans = a;
        } else if (a % 4 == 1) {
            ans = 1;
        } else if (a % 4 == 2) {
            ans = a + 1;
        } else if (a % 4 == 3) {
            ans = 0;
        }
        return ans;
    }
}
