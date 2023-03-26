// To find--------> Y times the sum of x

public class ProductOfTwoNumbersUsingRecursion {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        int ans = product(x, y);
        System.out.println(ans);
    }

    static int product(int x, int y) {
        if (y == 0) {
            return 0;
        }

        return x + product(x, y - 1);
    }
}
