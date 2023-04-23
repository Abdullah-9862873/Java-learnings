public class ReverseANumber {
    public static void main(String[] args) {
        int n = 12345;
        // reverse1(n);
        // System.out.println(sum);

        // Method 2
        int ans = reverse2(n);
        System.out.println(ans);
    }

    static int sum = 0;
    static void reverse1(int n) {
        if(n == 0){
            return;
        }

        int rem = n%10;
        sum = sum*10 + rem;
        reverse1(n/10);
    }


    // Mehtod 2
    static int reverse2(int n){
        if(n%10 == n){
            return n;
        }

        // Here I want the rem to be at the position count(n)-1
        int rem = n%10;

        return (int)(rem * Math.pow(10, (int)(Math.log10(n) + 1)-1)) + reverse2(n/10);
    }
}
