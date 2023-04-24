public class SkipApple{
    public static void main(String[] args) {
        String input = "bdapplefg";
        String ans = removeApple(input);
        System.out.println(ans);
    }

    static String removeApple(String str){
        if(str.length() == 0){
            return str;
        }

        if(str.startsWith("apple")){
            return removeApple(str.substring(5));
        }
        return str.charAt(0) + removeApple(str.substring(1));
    }
}