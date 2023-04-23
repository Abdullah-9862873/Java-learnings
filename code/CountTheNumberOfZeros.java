public class CountTheNumberOfZeros {
    public static void main(String[] args) {
        int n = 10020;
        // method1(n);
        // System.out.println(count);

        int ans = method2(n, 0);
        System.out.println(ans);

    }

    static int count = 0;
    static void method1(int n){
        if(n==0){
            return;
        }
        if(n%10 == 0){
            count = count + 1;
        }
        method1(n/10);
    }


    // Method 2
    static int method2(int n, int count){
        if(n==0){
            return count;
        }
        if(n%10 == 0){
            return method2(n/10, count+1);
        }
        return method2(n/10, count);
    }
}
