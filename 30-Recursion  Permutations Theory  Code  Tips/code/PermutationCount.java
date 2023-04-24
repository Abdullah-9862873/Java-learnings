public class PermutationCount{
    public static void main(String[] args){
        String str = "abc";
        int ans = findPermutationCount("",str);
        System.out.println(ans);

        // Cheat method
        // int count = fact(str.length());
        // System.out.println(count);
    }
    
    static int findPermutationCount(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            return 1;
        }

        char ch = unProcessed.charAt(0);

        int count = 0;
        for(int i=0; i<=processed.length(); i++){
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            count += findPermutationCount(first + ch + second, unProcessed.substring(1));
        }
        return count;
    }

    static int fact(int num){
        if(num==0 || num==1){
            return 1;
        }

        return num * fact(num-1);
    }
}