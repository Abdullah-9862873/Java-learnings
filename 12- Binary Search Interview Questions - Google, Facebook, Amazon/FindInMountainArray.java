package neww;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 3, 2, 1 };
        int target = 2;

        // Finding the peak element
        int peakElementIndex = findPeak(array);

        int ans = binarySearchAsc(array, target, peakElementIndex);
        if (ans == -1) {
            int ans2 = binarySearchDesc(array, target, peakElementIndex);
            System.out.println(ans2);
        } else {
            System.out.println(ans);
        }

    }

    // Finding the peak element
    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    // Binary Search for ascending order
    static int binarySearchAsc(int[] arr, int target, int peakElement) {
        int ans = -1;
        int start = 0;
        int end = peakElement;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                break;
            }
        }
        return ans;
    }

    // Binary Search for descending order
    static int binarySearchDesc(int[] arr, int target, int peakElement) {
        int ans = -1;
        int start = peakElement;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                break;
            }
        }
        return ans;
    }
}
