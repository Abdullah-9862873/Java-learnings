import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 6, 5, 4, 3, 2, 1 };
        cyclicSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] cyclicSorting(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // Find the correct element that should be at that index
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

/*
 * When given the range from 1 to N then use --> Cyclic Sort
 * When the range is given from 1 to N then one thing to notice is -------->
 * Index = value - 1
 * 
 * In the worst case lets say in (3,5,2,1,4) ------> First it will make (n-1)
 * comparisons to make it sorted
 * -------------> After that for the last time it will check for every number
 * whether it is at the right position so it will make (n) comparisons
 * -------------> Total = (n-1) + n
 * -------------> 2n - 1
 * -------------> O(n)
 */