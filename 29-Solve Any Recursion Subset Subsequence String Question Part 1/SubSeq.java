import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        // subseq("", "ahbgdc");

        ArrayList<String> ans = new ArrayList<>();
        ans = subSeqRet("", "abcd");
        System.out.println(ans);
        
    }

    static void subseq(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unProcessed.charAt(0);

        subseq(processed+ch, unProcessed.substring(1));
        subseq(processed, unProcessed.substring(1));
    }

    static ArrayList<String> subSeqRet(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            list.add(processed);
            return list;
        }

        char ch = unProcessed.charAt(0);

        ArrayList<String> left = subSeqRet(processed+ch, unProcessed.substring(1));
        ArrayList<String> right = subSeqRet(processed, unProcessed.substring(1));

        left.addAll(right);
        return left;
    }
}


/*
Subsets are for arrays and SubSequences are for Strings
*/