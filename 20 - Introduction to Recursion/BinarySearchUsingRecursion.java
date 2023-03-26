
/*
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
*/
public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 3, 5, 9, 12 };
        int target = 9;

        System.out.println(BinarySearch(0, arr.length - 1, arr, target));
    }

    static int BinarySearch(int s, int e, int[] arr, int target) {
        int mid = s + (e - s) / 2;

        // Base condition
        if (s > e) {
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        }

        // Processing
        if (target < arr[mid]) {
            return BinarySearch(s, mid - 1, arr, target);
        } else if (target > arr[mid]) {
            return BinarySearch(mid + 1, e, arr, target);
        }
        return -1;
    }
}