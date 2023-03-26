/*
Given an array of integers arr, the task is to find the minimum and maximum element of that array using recursion.

Examples : 

Input: arr = {1, 4, 3, -5, -4, 8, 6};
Output: min = -5, max = 8

Input: arr = {1, 4, 45, 6, 10, -8};
Output: min = -8, max = 45
*/
public class MinimumAndMaximum {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, -5, -4, 8, 6 };
        System.out.println(printMin(arr, arr.length));
        System.out.println(printMax(arr, arr.length));
    }

    static int printMin(int[] arr, int n) {
        // Base condition
        if (n == 1) {
            return arr[0];
        }

        // Processing
        return Math.min(arr[n - 1], printMin(arr, n - 1));
    }

    static int printMax(int[] arr, int n) {
        // Base condition
        if (n == 1) {
            return arr[0];
        }

        return Math.max(arr[n - 1], printMax(arr, n - 1));
    }

}
