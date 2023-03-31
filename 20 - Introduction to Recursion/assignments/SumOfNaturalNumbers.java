public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n = 3;
        int ans = naturalNumbersSum(n);
        System.out.println(ans);
    }

    static int naturalNumbersSum(int n) {
        // Base case
        if (n <= 1) {
            return n;
        }
        return n + naturalNumbersSum(n - 1);
    }
}
