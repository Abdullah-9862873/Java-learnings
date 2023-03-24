package New;

public class PrimeNumberOfSetBitsInBinary {
    public static void main(String[] args) {
        int left = 10;
        int right = 15;

        int ans = 0;

        for (int i = left; i <= right; i++) {
            int count = Integer.bitCount(i);

            // Check if the count is prime or not
            boolean check = isPrime(count);
            if (check) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if ((n & 1) == 0) {
            // It is even number
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
