public class CheckForPalindrome {
    public static void main(String[] args) {
        int n = 12321;
        System.out.println(isPalindrome(n)); 
    }

    static int reverse(int n){
        if(n%10 == n){
            return n;
        }

        // Here I want the rem to be at the position count(n)-1
        int rem = n%10;

        return (int)(rem * Math.pow(10, (int)(Math.log10(n) + 1)-1)) + reverse(n/10);
    }

    static boolean isPalindrome(int n){
        if(n == reverse(n)){
            return true;
        }
        return false;
    }
}
