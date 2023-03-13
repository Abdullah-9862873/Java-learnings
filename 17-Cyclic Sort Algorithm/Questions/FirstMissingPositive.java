
// Given an unsorted integer array nums, return the smallest missing positive integer.

// You must implement an algorithm that runs in O(n) time and uses constant extra space.

// Example 1:

// Input: nums = [1,2,0]
// Output: 3
// Explanation: The numbers in the range [1,2] are all in the array.

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = { 1 };

        int ans = findMissing(nums);
        System.out.println(ans);

    }

    static int findMissing(int[] arr) {
        cyclicSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return arr.length + 1;
    }

    static int[] cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        return arr;
    }

    static int[] swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return arr;
    }

}
