public class ArraySortedOrNot{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        boolean ans = checkForSort(arr, 0);
        System.out.println(ans);
    }

    static boolean checkForSort(int[] arr, int index){
        if((index) == (arr.length-1)){
            return true;
        }
        return (arr[index]<arr[index+1]) && (checkForSort(arr, index+1));
    }
}