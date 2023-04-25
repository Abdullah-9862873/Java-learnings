import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number{
    public static void main(String[] args) {
        String str = "12";
        List<String> ans = letterCombinations2("", str);
        System.out.println(ans);
    }

    static void letterCombinations(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        int digit = unProcessed.charAt(0) - '0';

        for(int i=(digit-1)*3; i<(digit*3); i++){
            char ch = (char)('a' + i);
            letterCombinations(processed + ch, unProcessed.substring(1));
        }
        return;
    }

    static List<String> letterCombinations2(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        int digit = unProcessed.charAt(0) - '0';
        List<String> ans = new ArrayList<>();

        for(int i=(digit-1)*3; i<(digit*3); i++){
            char ch = (char)('a' + i);
            ans.addAll(letterCombinations2(processed+ch, unProcessed.substring(1)));
        }
        return ans;
    }

    

}