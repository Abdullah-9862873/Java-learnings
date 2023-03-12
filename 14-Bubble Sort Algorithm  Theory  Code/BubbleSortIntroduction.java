import java.util.Arrays;

public class BubbleSortIntroduction {
    public static void main(String[] args) {
        int[] arr = { -1, 3, -5, 1, -8 };

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        return arr;
    }
}

/*
 * Bubble Sort is also known as sinking sort, exchange sort and comparison sort
 * where the comparison is in between the two adjacent elements of the array
 * 
 * Space Complexity---> O(1) ---> Constant ----> NO extra space required i-e
 * copying the array etc.
 * It is also known as inplace sorting algorithm
 * 
 * Time Complexity--->
 * Best_Case ----> O(n) comparisons---> You only have to traverse it one time
 * Worst_Case ----> O(n*n) comparisons----> If the array is in decreasing order
 * and you have to sort it in increasing
 * 
 * 
 * If the number is [5,4,3,2,1]
 * Then the total time complexity would be what??
 * It would be as follows----------------->
 * 
 * In first pass ------> (n-1)
 * In second pass ------> (n-2)
 * in third pass ------->(n-3)
 * in fourth pass -------> (n-4)
 * 
 * Now the total would be ------> n+n+n+n - (1+2+3+4)
 * ------------------------------> 4n - ((n*(n+1))/2)
 * ------------------------------> 4n - ((n^2 + n) / 2)
 * ------------------------------> (8n - n^2 - n) / 2
 * ------------------------------> (7n - n^2) / 2
 * In Big O notation the constants are cancelled (7 and 2) and the less
 * dominating terms are removed (n) so
 * Time compexity in worse case i-e in this case is -----------> O(n^2)
 * 
 * 
 * 
 * 
 * In the passes the (n-1) is like the (lengthOfArr-i-1) because after every
 * pass the last element is not counted in the next pass and that is why we keep
 * subtracting the value i from it and it keeps increasing after every pass
 * 
 * _________________________Stability_________________________
 * 
 * When the original order is maintained of the same array values after sorting
 * then it is called stable sorting
 * When two or more values are same in the original array and after sorting
 * their order is not maintained like lets say there are two balls of value 10
 * one is red and the other is black. And before sorting the red ball is after
 * the black one.... But after sorting the black comes before the red one then
 * this type of sorting is called unstable sorting even thought the values are
 * sorted but the order is not maintained.
 */