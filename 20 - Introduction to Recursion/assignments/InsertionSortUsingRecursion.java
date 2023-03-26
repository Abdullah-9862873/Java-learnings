import java.util.Arrays;

public class InsertionSortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };
        insertionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] insertionSort(int[] arr, int n) {
        // Base condition
        if (n <= 1) {
            return arr;
        }

        insertionSort(arr, n - 1);

        int last = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;

        return arr;
    }
}
