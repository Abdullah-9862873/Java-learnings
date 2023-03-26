/*
 * When a bigger problem can be divided into smaller problems then it is a signal that you can apply recursion like in this question of fibonacci numbers where fib(n)=fib(n-1)+fib(n-2)
 */
public class FibonacciNumber {
    public static void main(String[] args) {
        int ans = fib(50);
        // Print nth fibonacci number
        System.out.println(ans);

    }

    static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}

/*
 * The time complexity of it is ((sqrt(5)+1)/2)^n
 */
