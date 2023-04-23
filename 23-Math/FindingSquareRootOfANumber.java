public class FindingSquareRootOfANumber {
    public static void main(String[] args) {
        int n = 40;
        int p = 6;

        System.out.printf("%.6f", sqrt(n, p));
    }

    static double sqrt(int n, int p) {
        int start = 0;
        int end = n;

        double root = 0.0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == n) {
                return mid;
            }
            if (mid * mid > n) {
                end = mid - 1;
            }
            if (mid * mid < n) {
                start = mid + 1;
            }
        }

        // To p precision you want the answer to be
        double inc = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += inc;
            }

            root -= inc;
            inc /= 10;
        }

        return root;
    }
}
