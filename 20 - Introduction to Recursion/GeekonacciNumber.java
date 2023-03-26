/*
Geek created a random series and given a name geek-onacci series. Given four integers A, B, C, N. A, B, C represents the first three numbers of geek-onacci series. Find the Nth number of the series. The nth number of geek-onacci series is a sum of the last three numbers (summation of N-1th, N-2th, and N-3th geek-onacci numbers)

Input:
1. The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
2. The first line of each test case contains four space-separated integers A, B, C, and N.

Output: For each test case, print Nth geek-onacci number

*/
public class GeekonacciNumber {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 2;
        int n = 3;

        // int num = geekonacciNo(a, b, c, n);
        // System.out.println(a + " " + b + " " + c + " " + num);

        for (int i = 1; i <= n; i++) {
            System.out.println(geekonacciNo(a, b, c, n + i));
        }
    }

    static int geekonacciNo(int a, int b, int c, int n) {
        // Base condition
        if (n == 3) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 1) {
            return 1;
        }

        // Recurrence relation
        return geekonacciNo(a, b, c, n - 1) + geekonacciNo(a, b, c, n - 2) + geekonacciNo(a, b, c, n - 3);
    }
}
