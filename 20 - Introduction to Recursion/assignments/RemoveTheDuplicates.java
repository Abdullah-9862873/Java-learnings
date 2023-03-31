public class RemoveTheDuplicates {
    public static void main(String[] args) {
        String str = "abddddduuuullllaaaahhh";
        String ans = removeDuplicates(str);
        System.out.println(ans);
    }

    static String removeDuplicates(String str) {
        if (str.length() == 0 || str == null) {
            return "";
        }
        if (str.length() == 1) {
            return str;
        }

        if (str.charAt(0) == str.charAt(1)) {
            return removeDuplicates(str.substring(1));
        }
        return str.charAt(0) + removeDuplicates(str.substring(1));
    }

}