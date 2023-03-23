package Questions.New;

public class FindXorFromZeroToA {
    public static void main(String[] args) {
        int a = 9;

        int ans = 0;
        if (a % 4 == 0) {
            ans = a;
        } else if (a % 4 == 1) {
            ans = 1;
        } else if (a % 4 == 2) {
            ans = a + 1;
        } else if (a % 4 == 3) {
            ans = 0;
        }
        System.out.println(ans);

    }
}

/*
 * The XOR of numbers from 0 to 9 are given below:
 * 0 ----------> 0
 * 1-----------> 0^1 ---------> 1
 * 2----------->0^1^2 --------> 3
 * 3----------> 0^1^2^3 ------> 0
 * 4----------> 0^1^2^3^4 ------> 4
 * 5----------> 0^1^2^3^4^5 ------> 1
 * 6----------> 0^1^2^3^4^5^6 ------> 7
 * 7----------> 0^1^2^3^4^5^6^7 ------> 0
 * 8----------> 0^1^2^3^4^5^6^7^8 ------> 8
 * 9----------> 0^1^2^3^4^5^6^7^8^9 ------> 1
 * 
 * So here a pattern is being followed which is that:
 * --> After every 4 numbers the answer is the number itself--> Look at 0,4,8
 * --> After evert 4+1 numbers the answer is-----> 1
 * --> After every 4+2 numbers the answer is-----> number+1
 * --> After every 4+3 numbersr the answer is----> 0
 * 
 * 
 * So the conclusion is
 * if (a%4)==0 -------------> Answer is a
 * if (a%4) == 1------------> Answer is 1
 * if (a%4)== 2 ------------> Answer is (a + 1)
 * if (a%4)==3 -------------> Answer is 0
 * 
 */
