public class PowerOfThree {
    public static void main(String[] args) {
        int n = 27;
        boolean ans = checkPowerOfThree(n);
        System.out.println(ans);
    }

    static boolean checkPowerOfThree(int n) {
        // Base case
        if (n == 1) {
            return true;
        }
        if (n == 0) {
            return false;
        }

        return n % 3 == 0 && checkPowerOfThree(n / 3);
    }
}
