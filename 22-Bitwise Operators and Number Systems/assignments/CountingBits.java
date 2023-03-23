import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        int n = 5;
        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            // For every i count the set bits
            if (i == 0) {
                ans[i] = 0;
            } else {
                ans[i] = countSetBits(i);
            }
        }
        System.out.println(Arrays.toString(ans));
    }

    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            int lastBit = n & 1;
            if (lastBit == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}