public class SumOfDigits {
    public static void main(String[] args) {
        // int n = 1342;
        // Answer should be 1+3+4+2 = 10

        int n = 90801;
        int ans = sum(n);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }

        return (n%10) + sum(n/10);
    }

    static int product(int n){
        if(n%10 == n){
            // Only one digits is left so return that digit
            return n;
        }

        return (n%10) * product(n/10);
    }
}
