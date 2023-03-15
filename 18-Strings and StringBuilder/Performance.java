public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            // System.out.println(ch);
            series = series + ch;
        }

        System.out.println(series);

        System.out.println("a" + 'a');
    }
}

/*
 * We already know that if one of the data type in addition is string then the
 * answer would be in string
 * 
 * __________________________________________________________________________
 * Problem here----->
 * 
 * In the loop when the series is getting updated then in the first step the
 * series would become "a" and then in the second iteration a new object is
 * created which is "ab" and similarly in third iteration a new object is
 * created "abc"
 * 
 * So O(n^2) is used to make the variables like "abcd....y" and they are not
 * pointed by any referene variable so this is wastage of space
 * O(n^2) because it is (1+2+3+4+.....n)-------> O(n(n+1)/2)
 * 
 * Check SB.java for more clarification
 */