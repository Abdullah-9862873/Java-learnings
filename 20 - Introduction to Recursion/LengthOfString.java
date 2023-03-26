/*
Given a string calculate length of the string using recursion. 

Examples: 

Input : str = "abcd"
Output :4

Input : str = "GEEKSFORGEEKS"
Output :13

*/
public class LengthOfString {
    public static void main(String[] args) {
        String str = "GeeksforGeeks";
        System.out.println(countLength(str, 0, 0));
    }

    static int countLength(String str, int startingIndex, int count) {
        // Base condition
        if (startingIndex == str.length()) {
            return count;
        }

        return countLength(str, startingIndex + 1, count + 1);

    }
}
