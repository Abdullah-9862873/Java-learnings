public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 1, 2, 3, 4 };
        int target = 4;

        int ans = search(arr, target, 0, arr.length - 1);
        System.out.println(ans);

    }

    static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        }

        // Edge Cases
        if (arr[start] < arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return search(arr, target, start, mid - 1);
            } else {
                return search(arr, target, mid + 1, end);
            }
        }

        else if (arr[mid] < arr[end]) {
            if (target >= arr[mid] && target <= arr[end]) {
                return search(arr, target, mid + 1, end);
            }
        }
        return search(arr, target, start, mid-1);
    }
}
