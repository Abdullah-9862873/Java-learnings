
/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

*/
public class ReverseAString {
    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        ReverseStr(s, 0, s.length - 1);
        System.out.println(s);
    }

    static char[] ReverseStr(char[] str, int first, int last) {
        // Base condition
        if (first == last || first > last) {
            return str;
        }

        char temp = str[first];
        str[first] = str[last];
        str[last] = temp;

        return ReverseStr(str, first + 1, last - 1);
    }
}
