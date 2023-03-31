/*
Given an array of size n, write a program to check if it is sorted in ascending order or not. Equal values are allowed in an array and two consecutive equal values are considered sorted.

Examples: 

Input : 20 21 45 89 89 90
Output : Yes

Input : 20 20 45 89 89 90
Output : Yes

Input : 20 20 78 98 99 97
Output : No

*/
public class RecursiveFunctionToFindWhetherArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = { 20, 21, 45, 89, 89, 90 };
        boolean ans = check(arr, 0, arr.length);
        System.out.println(ans);
    }

    static boolean check(int[] arr, int start, int length) {
        // base case
        if (arr[start] > arr[start + 1]) {
            return false;
        }
        if (start == length - 2 && (arr[start] < arr[start + 1])) {
            return true;
        }

        return check(arr, start + 1, length);
    }
}
