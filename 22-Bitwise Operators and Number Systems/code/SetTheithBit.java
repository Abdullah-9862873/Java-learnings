package Questions.Old;

public class SetTheithBit {
    public static void main(String[] args) {
        int n = 0b1010110;
        // Set the 4th bit to 1
        int i = 4;

        int mask = 1 << i - 1;
        int ans = n | mask;

        System.out.println(Integer.toBinaryString(ans));

    }
}

/*
 * Generate a mask... Mask is basically at the ith bit put 1 and the rest would
 * be zeros
 * You can use left shift operator to do so
 * 
 * Here the 0b in the input indicates that it is a binary number
 */