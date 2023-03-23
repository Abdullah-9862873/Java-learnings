package Questions.New;

public class FindIfANumberIsPowerOfTwo {
    public static void main(String[] args) {
        int n = 32;

        if (n == 0) {
            System.out.println("It is not a power of two");
        } else if (((n) & (n - 1)) == 0) {
            System.out.println("It is a power of two");
        } else {
            System.out.println("It is not a power of two");
        }
    }
}
