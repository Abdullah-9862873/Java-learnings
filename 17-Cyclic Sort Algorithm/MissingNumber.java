public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = { 0, 1 };
        int ans = missingNumber(nums);
        System.out.println(ans);
    }

    static int missingNumber(int[] arr) {
        // Do cyclic sort
        cyclicSort(arr);
        // Search for the missing number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return arr.length;

    }

    static int[] cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
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