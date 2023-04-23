public class LeastCommonFactor {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;

        int ans = LCM(a, b);
        System.out.println(ans);
    }

    static int LCM(int a, int b) {
        int d = gcd(a, b);
        int f = a / d;
        int g = b / d;

        return f * g * d;
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}

/*
 * Least Common Factor
 * -------------------> LCM(a,b)
 * -------------------> d = gcd(a,b)
 * -------------------> Both "a" and "b" can divide "d"
 * -------------------> So, f = a/d, g = b/d
 * -------------------> a = fd, b = gd
 * -------------------> LCM(fd,gd)
 * 
 * Note---------------> Both "f" and "g" have no other factors in common so we
 * -------------------> can say that "f*g" has no other factors in common
 * 
 * If a number is divisible by "a" and that number is also divisible by "b" so
 * does this not mean that the number is divisible by "a*b"
 * so we can say
 * -------------------> LCM = a*b
 * -------------------> LCM = fd*gd
 * -------------------> d is getting repeated so it is written once to satisfy
 * the above equation
 * -------------------> LCM = f*g*d
 * 
 */