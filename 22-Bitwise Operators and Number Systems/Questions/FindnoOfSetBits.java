package Questions.New;

public class FindnoOfSetBits {
    public static void main(String[] args) {
        int n = 11;

        // Method 1
        // int count = 0;
        // while (n > 0) {
        // int lastBit = n & 1;
        // if (lastBit == 1) {
        // count += 1;
        // }
        // n = n >> 1;
        // }

        // System.out.println(count);

        // Method 2
        int count = 0;

        while (n > 0) {
            count += 1;

            n = n - (n & -n);
        }
        System.out.println(count);

    }
}

/*
 * Last set bit can be obtained by:
 * Last bit of n is ---------> -n
 * Now the -n represents (compliment of n + 1)
 */
