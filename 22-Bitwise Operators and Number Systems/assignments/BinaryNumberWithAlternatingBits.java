package New;

public class BinaryNumberWithAlternatingBits {
    public static void main(String[] args) {
        int n = 5;

        // Check 1---> See if it is alternating

        int first = n ^ n >> 1;

        // If the first has all the bits 1 then the n has alternating bits
        // To check if the first has all the bits 1 we can AND it with first + 1
        int second = first & first + 1;

        // If second is zero then that means I had gotten all 1's in the first step
        if (second == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
