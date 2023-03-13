// Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

// You must write an algorithm that runs in O(n) time and uses only constant extra space.

// Example 1:

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [2,3]

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 3, 2, 1 };
        System.out.println(findAllDuplicates(nums));

    }

    static List<Integer> findAllDuplicates(int[] arr) {
        cyclicSort(arr);
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                list.add(arr[i]);
            }
        }
        return list;
    }

    static int[] cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
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