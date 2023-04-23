/*
 * Euclidean Algorithm----------> This algorithm is used to find the HCF or GCD
 * or two numbers... Generally larger numbers
 * 
 * 
 * gcd(a,b) = gcd(b,a%b)
 * 
 * And we have to run it until the second entity becomes zero
 * 
 * =gcd(b,0)
 * 
 * And the GCD of a number with zero is the number itself which is the answer
 * _______________________________________________________________________________________________________
 * 
 * For Example------------------> gcd(1025, 35)
 * -----------------------------> gcd(35, 1025 % 35)
 * -----------------------------> gcd(35, 10)
 * -----------------------------> gcd(10, 35 % 10)
 * -----------------------------> gcd(10, 5)
 * -----------------------------> gcd(5, 10 % 5)
 * -----------------------------> gcd(5, 0)
 * -----------------------------> 5
 * 
 * So the answer is 5
 * 
 */

public class EuclidsAlgorithm {
    public static void main(String[] args) {
        int a = 4;
        int b = 9;

        int ans = euclidTheorem(a, b);
        System.out.println(ans);
    }

    static int euclidTheorem(int a, int b) {
        if (b == 0) {
            return a;
        }

        return euclidTheorem(b, a % b);
    }
}