public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 5, 1 ,8,1,3,6,3};

        // sort1(arr, 0, arr.length);

        sort2(arr, arr.length, 0, 0);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static int[] sort1(int[] arr, int index, int end) {
        if (end == 1) {
            return arr;
        }
        int maxIndex = findMax(arr, index + 1, end, 0);
        swap(arr, maxIndex, end - 1);

        return sort1(arr, index, end - 1);
    }

    static int findMax(int[] arr, int start, int end, int max) {
        if (start == end) {
            return max;
        }

        if (arr[start] > arr[max]) {
            max = start;
            return findMax(arr, start + 1, end, max);
        }
        return findMax(arr, start + 1, end, max);
    }

    static int[] swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

        return arr;
    }


    // Short Method
    static int[] sort2(int[] arr, int r, int c, int max){
        if(r == 0){
            return arr;
        }

        if(c < r){
            if(arr[c] > arr[max]){
                return sort2(arr, r, c+1, c);
            }else{
                return sort2(arr, r, c+1, max);
            }
        }else{
            // We have found the maximum now time to swap them
            int temp = arr[r-1];
            arr[r-1] = arr[max];
            arr[max] = temp;
        }
        return sort2(arr, r-1, 0, 0);
    }
}
