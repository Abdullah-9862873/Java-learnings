package Questions.New;

public class XORofNumbersBetweenAandB {
    public static void main(String[] args) {
        int a = 3;
        int b = 8;

        int first = xorTillN(b);
        int second = xorTillN(a - 1);

        int ans = first ^ second;
        System.out.println(ans);
    }

    static int xorTillN(int n) {
        int ans = 0;

        if (n % 4 == 0) {
            ans = n;
        } else if (n % 4 == 1) {
            ans = 1;
        } else if (n % 4 == 2) {
            ans = n + 1;
        } else if (n % 4 == 3) {
            ans = 0;
        }
        return ans;
    }
}
