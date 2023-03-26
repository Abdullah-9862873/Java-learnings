public class SumOfDigitsOfANumberUsingRecursion {
    public static void main(String[] args) {
        int n = 12345;

        int ans = sumOfDigits(n);

        System.out.println(ans);
    }

    static int sumOfDigits(int n) {
        // Base condition
        if (n == 0) {
            return 0;
        }

        return n % 10 + sumOfDigits(n / 10);
    }
}
