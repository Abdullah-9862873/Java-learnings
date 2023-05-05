public class Permutation{
    public static void main(String[] args) {
        String str = "abc";
        findPermutations("", str);
    }
    static void findPermutations(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unProcessed.charAt(0);

        for(int i=0; i<=processed.length(); i++){
            String first = processed.substring(0,i);
            String second = processed.substring(i, processed.length());
            findPermutations(first + ch + second, unProcessed.substring(1));
        }
        return;
    }
}