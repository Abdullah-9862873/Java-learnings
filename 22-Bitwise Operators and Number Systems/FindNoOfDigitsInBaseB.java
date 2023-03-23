package Questions.New;

import java.util.Scanner;

public class FindNoOfDigitsInBaseB {
    public static void main(String[] args) {
        System.out.println("Enter the number");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println("Enter the base");
        int base = input.nextInt();

        input.close();

        double log = Math.log(num) / Math.log(base);
        int ans = (int) log + 1;
        System.out.println(ans);
    }
}