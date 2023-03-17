public class BinarySearchWithRecursion {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 55, 66, 78 };
        int target = 66;
        System.out.println(BinarySearch(arr, target, 0, arr.length - 1));
    }

    static int BinarySearch(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return BinarySearch(arr, target, s, mid - 1);
        }
        return BinarySearch(arr, target, mid + 1, e);
    }
}

/*
 * Whenever you have a function call which has a return type then make sure you
 * return it like in the upper example the following thing will not work
 * if (target < arr[mid]) {
 * BinarySearch(arr, target, s, mid - 1);
 * }
 * 
 * So you have to mention the return with this
 */
