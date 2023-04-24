import java.util.ArrayList;

public class LinearSearchWithRecursion {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4, 2, 8, 9 };
        int target = 2;

        // findNum(arr, 0, target);
        // System.out.println(find(arr, target, 0));

        // ArrayList<Integer> ans = new ArrayList<>();
        // findAllIndex(arr, target, 0, ans);
        // System.out.println(ans);

        ArrayList<Integer> ans = findAllIndex2(arr, target, 0);
        System.out.println(ans);
    }

    static void findNum(int[] arr, int start, int target) {
        // Base case
        if (start == arr.length) {
            System.out.println("Target not found");
            return;
        }
        if (arr[start] == target) {
            System.out.println("The value is present at index: " + start);
            return;
        }

        findNum(arr, start + 1, target);
    }

    static boolean find(int[] arr, int target, int start){
        // Base case
        if(start == arr.length){
            return false;
        }

        return arr[start]==target || find(arr, target, start+1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer>ans) {

        if(index == arr.length){
            return ans;
        }

        if(arr[index] == target){
            ans.add(index);
        }

        return findAllIndex(arr, target, index+1, ans);
    }

    // The goal I am gonna achieve is that Do not pass the array list as parameter or argument of the function
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> answersFromBelow = findAllIndex2(arr, target, index+1);
        list.addAll(answersFromBelow);
        return list;
    }

}
