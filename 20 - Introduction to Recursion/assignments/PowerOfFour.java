public class PowerOfFour {
    public static void main(String[] args) {
        int n = 48;
        boolean ans = CheckPowerOfFour(n);
        System.out.println(ans);
    }

    static boolean CheckPowerOfFour(int n) {
        // base case
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        return n % 4 == 0 && CheckPowerOfFour(n / 4);
    }
}
