package New;

import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class SortIntegersByTheNumberOfOneBits {
    public static void main(String[] args) {
        int[] arr = { 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1 };
        selectionSort(arr);

        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int countBits = Integer.bitCount(arr[i]);
            String value = Integer.toString(arr[i]);

            if (map.containsKey(countBits)) {
                String existingValue = map.get(countBits);
                value = existingValue + " " + value;
            }

            map.put(countBits, value);
        }

        // Start reading the hashmap from the top and put the values in the ans
        int[] ans = new int[arr.length];
        int index = 0;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            String val = entry.getValue();
            String[] values = val.split(" ");
            for (int i = 0; i < values.length; i++) {
                ans[index] = Integer.parseInt(values[i]);
                index++;
            }
        }
        System.out.println(Arrays.toString(ans));
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
