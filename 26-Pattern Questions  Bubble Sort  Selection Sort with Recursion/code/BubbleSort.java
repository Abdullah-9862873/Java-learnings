public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        // sort(arr, 0, arr.length);

        bubble2(arr, arr.length-1, 0);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static int[] sort(int[] arr, int index, int end) {
        // Base case
        if (index == end) {
            return arr;
        }

        if (index < end-1) {
            if (arr[index] > arr[index + 1]) {
                swap(arr, index, index + 1);
                return sort(arr, index + 1, end);
            }
        }
        return sort(arr, 0, end-1);
    }

    static int[] swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return arr;
    }

    // Method 2
    static int[] bubble2(int[] arr, int r, int c){
        if(r == 0){
            return arr;
        }

        if(c < r){
            if(arr[c] > arr[c+1]){
                swap(arr, c, c+1);
                return bubble2(arr, r, c+1);
            }else{
                return bubble2(arr, r, c+1);
            }
        }
        return bubble2(arr, r-1, 0);
    }
}
