package Questions.Old;

public class FindUniqueNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 3, 2, 6, 4 };
        System.out.println(ans(arr));

    }

    static int ans(int[] arr) {
        int unique = 0;

        for (int n : arr) {
            unique = unique ^ n;
        }

        return unique;
    }
}

/*
 * Any number taken XOR with itself gives zero
 * ------> a XOR a = 0
 */
