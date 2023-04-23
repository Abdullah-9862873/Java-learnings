public class NewtonRaphsonMethod {
    public static void main(String[] args) {
        double n = 40;
        System.out.println(newtonSqrt(n));
    }

    static double newtonSqrt(double n) {
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < 0.5) {
                break;
            }

            x = root;
        }
        return root;
    }
}

/*
 * Netwon Raphson Method states:
 * -------------> Root = ((X + (n/x))) / 2
 * -------------> Where n is the number whose root is to be found and X is the
 * guess
 * 
 * 
 * How to guess???
 * -------------> Make the X equal to n at first
 * ------------> Find root by the following method
 * -------------> We can find the error in X by
 * Error = (Actual root value) - (Guessed Value)
 * -------------> if this error is less than 1 or the precision you want then
 * the loop will break otherwise
 * -------------> Otherwise in each iteration update the guess with root you
 * guessed...
 */