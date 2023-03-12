import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { -7, -1, 3, 2, 0, -22 };

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            // Find the maximum element and replace it with the last element
            int maxElementIndex = findMaxElement(arr, 0, last);
            int temp = arr[maxElementIndex];
            arr[maxElementIndex] = arr[last];
            arr[last] = temp;
        }
        return arr;
    }

    static int findMaxElement(int[] arr, int start, int end) {
        int max = 0;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}

/*
 * Selection Sort is a sorting algorithm which is based on the selection of a
 * number from the array and putting it on the right position
 * 
 * Time Complexity-----------------------------------
 * At first step its gonna make (n-1) comparisons as it will take the first
 * element as max or min and compare it with the rest elements and put it in
 * right position
 * Similarly at second step (n-2) and so on...
 * So total would be 1+2+3+4+....+(n+1)
 * 
 * -----------------------> n*(n+1) / 2
 * ------------------------> O(n^2)
 * 
 * Best Case-------------->O(n^2)
 * Worse Case-------------->O(n^2)------>Because it is making the exact same
 * number of comparisons for both cases
 * 
 * Stable----------------> No
 * Best for small lists
 */