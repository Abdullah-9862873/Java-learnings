import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans = findSubArray2(arr);
        for(List<Integer> list: ans){
            System.out.println(list);
        }
    }

    static List<List<Integer>> findSubArray(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num: arr){
            int size = outer.size();
            for(int i=0; i<size; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }

    static List<List<Integer>> findSubArray2(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int startIndex = 0;

        for(int i=0; i<arr.length; i++){
            int size = outer.size();
            startIndex = (i>0 && arr[i] == arr[i-1]) ? size/2 : 0;
            for(int j=startIndex; j<size; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
    
}
