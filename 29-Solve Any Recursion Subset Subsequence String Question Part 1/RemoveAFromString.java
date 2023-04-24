public class RemoveAFromString {
    public static void main(String[] args) {
        String str = "baccaad";
        // str = removeAs(str, 0);
        str = removeAs2(str);
        System.out.println(str);
    }

    static String removeAs(String str, int index) {
        if (index == str.length()) {
            return str;
        }

        if (str.charAt(index) == 'a' || str.charAt(index) == 'A') {
            return removeAs((str.substring(0, index) + str.substring(index + 1)), index);
        }

        return removeAs(str, index + 1);
    }

    static String removeAs2(String str){
        if(str.length()==0){
            return str;
        }

        if((str.charAt(0) == 'a' || str.charAt(0)=='A') && str.length()>1){
            return removeAs2(str.substring(1));
        } else if((str.charAt(0) == 'a' || str.charAt(0) == 'A') && str.length()==1){
            return "";
        }

        if(str.length() >=2){
            String str2 = str.charAt(0) + removeAs2(str.substring(1));
            return str2;
        }

        return str;
    }
}
