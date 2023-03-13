import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4 };

        System.out.println(Arrays.toString(mismatch(nums)));

    }

    static int[] mismatch(int[] arr) {
        cyclicSort(arr);

        // Searching for the numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return new int[] { arr[i], i + 1 }; // {Repeating, Missing}
            }
        }
        return new int[] { -1, -1 };
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
