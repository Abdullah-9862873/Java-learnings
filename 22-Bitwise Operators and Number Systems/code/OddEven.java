package Questions.Old;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter a number to check: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(isOdd(n));

        input.close();
    }

    static boolean isOdd(int n) {
        return ((n & 1) == 1);
    }
}
