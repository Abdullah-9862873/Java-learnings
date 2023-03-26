public class PrimeOrNot {
    public static void main(String[] args) {
        int n = 18;
        boolean ans = checkPrime(n, 2);
        System.out.println(ans);
    }

    static boolean checkPrime(int n, int i) {
        if (n <= 2) {
            return (n == 2) ? true : false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }

        return checkPrime(n, i + 1);
    }
}
