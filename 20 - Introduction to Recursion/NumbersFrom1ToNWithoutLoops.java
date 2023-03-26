/*
Print numbers from 1 to N without the help of loops.

Example 1:

Input:
N = 10
Output: 1 2 3 4 5 6 7 8 9 10

*/
public class NumbersFrom1ToNWithoutLoops {
    public static void main(String[] args) {
        int N = 10;

        printNumbersTillN(N);
    }

    static void printNumbersTillN(int n) {
        // Base condition
        if (n == 0) {
            return;
        }

        printNumbersTillN(n - 1);

        System.out.println(n);
    }
}
