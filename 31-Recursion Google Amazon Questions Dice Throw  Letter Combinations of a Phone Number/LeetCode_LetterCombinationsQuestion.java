import java.util.ArrayList;
import java.util.List;

public class LeetCode_LetterCombinationsQuestion {
    public static void main(String[] args) {
        // List<String> ans = letterCombinations2("", "");
        // System.out.println(ans);

        List<String> list = new ArrayList<>();
        System.out.println(list);
    }

    static List<String> letterCombinations2(String processed, String unProcessed){
        if(processed.equals("") && unProcessed.equals("")){
            List<String> list = new ArrayList<>();
            return list;
        }
        if(unProcessed.isEmpty()){
            List<String> list = new ArrayList<>();    
            list.add(processed);
            return list;
        }

        int digit = unProcessed.charAt(0) - '0';
        // Handling start
        int start = 0;
        if(digit <= 7){
            start = ((digit-1)*3)-3;
        }
        else if(digit > 7){
            start = ((digit-1)*3)-2;
        }

        // Handling end
        int end = 0;
        if(digit == 8){
            end = (digit-1)*3;
        }
        else if(digit < 7){
            end = (digit-1)*3 - 1;
        }else if(digit == 7){
            end = (digit-1)*3;
        }else if(digit == 9){
            end = (digit-1)*3 + 1;
        }

        List<String> ans = new ArrayList<>();
        for(int i=start; i<=end; i++){
            char ch = (char)('a' + i);
            ans.addAll(letterCombinations2(processed+ch, unProcessed.substring(1)));
        }
        return ans;
    }
}
