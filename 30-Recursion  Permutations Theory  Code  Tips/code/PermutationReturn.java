import java.util.ArrayList;
import java.util.List;

public class PermutationReturn {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> ans = findPermutation("", str);
        System.out.println(ans);
    }

    static ArrayList<String> findPermutation(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            list.add(processed);
            return list;
        }
        
        char ch = unProcessed.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        

        for(int i=0; i<=processed.length(); i++){
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            List<String> internal = findPermutation(first + ch + second, unProcessed.substring(1));
            ans.addAll(internal);
        }
        return ans;
    }
}
