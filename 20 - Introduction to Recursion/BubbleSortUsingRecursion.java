import java.util.Arrays;

public class BubbleSortUsingRecursion {
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        BubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] BubbleSort(int[] arr, int n) {
        // base condition
        if (n == 1) {
            return arr;
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                swap(arr, i + 1, i);
            }
        }

        return BubbleSort(arr, n - 1);

    }

    static int[] swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return arr;
    }
}
