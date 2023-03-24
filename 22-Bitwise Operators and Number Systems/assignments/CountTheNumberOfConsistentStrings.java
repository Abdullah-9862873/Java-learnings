/*
You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.

 

Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.

*/

package New;

public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {
        String allowed = "abc";
        String[] words = { "a", "b", "c", "ab", "ac", "bc", "abc" };

        boolean[] allowedChars = new boolean[26];
        int count = 0;

        for (int i = 0; i < allowed.length(); i++) {
            char ch = allowed.charAt(i);
            allowedChars[ch - 'a'] = true;
        }

        for (String word : words) {
            boolean consistent = true;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (!allowedChars[ch - 'a']) {
                    consistent = false;
                    break;
                }
            }
            if (consistent) {
                count++;
            }
        }
        System.out.println(count);
    }
}
