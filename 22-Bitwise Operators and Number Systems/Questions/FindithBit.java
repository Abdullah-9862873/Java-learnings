package Questions;

import java.util.Scanner;

public class FindithBit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        // Converting to Binary
        String rem = "";
        while (n != 0) {
            // rem = rem * 10 + (n % 2);
            int remainder = n % 2;
            rem += remainder;
            n = n / 2;
        }
        // Reversing the string
        StringBuilder str = new StringBuilder(rem);
        str.reverse().toString();

        // System.out.println(str);

        System.out.println("The number of bits for the given number are: " + str.length());
        System.out.println("Which bit you want to print on screen?");
        int bitInput = input.nextInt();
        input.close();

        // I am using the original string i-e before reversing the string to give the
        // user the bit he wants
        System.out.println("The " + bitInput + " bit is: " + rem.charAt(bitInput - 1));

    }
}
