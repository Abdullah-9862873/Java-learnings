public class PalindromeQuestion {
    public static void main(String[] args) {
        String str = "";
        boolean check = true;

        for (int i = 0; i <= str.length() / 2; i++) {
            if (str == "null" || str.length() == 0) {
                check = false;
                break;
            }
            int first = i;
            int last = str.length() - i - 1;
            if (str.toLowerCase().charAt(first) == str.toLowerCase().charAt(last)) {
                continue;
            } else {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println("It is palindrome string");
        } else {
            System.out.println("It is not a palindrome string");
        }
    }
}
