public class SpecialFibonacciSeries {
    public static void main(String[] args) throws java.lang.Exception {
        int a = 86;
        int b = 77;
        int n = 5;
        System.out.println(fibo(a, b, n));

    }

    static int fibo(int a, int b, int n) {
        // base condition
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }

        return fibo(a, b, n - 1) ^ fibo(a, b, n - 2);
    }
}
