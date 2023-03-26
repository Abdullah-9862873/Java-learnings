/*
Given a string find its first uppercase letter
Examples : 

Input : geeksforgeeKs
Output : K

Input  : geekS
Output : S

*/
public class FindUpperCaseLetterInAString {
    public static void main(String[] args) {
        String input = "geeksforgeeKs";
        int startingIndex = 0;
        System.out.println(findUpperCase(input, startingIndex));

    }

    static char findUpperCase(String input, int i) {
        // Base condition
        if (i == input.length()) {
            return 0;
        }

        char ch = input.charAt(i);
        if ((int) ch >= 65 && (int) ch <= 90) {
            return ch;
        }

        return findUpperCase(input, i + 1);
    }
}