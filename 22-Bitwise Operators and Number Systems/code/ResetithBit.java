package Questions.Old;

import java.util.Scanner;

public class ResetithBit {
    public static void main(String[] args) {
        int n = 0b1010110;

        System.out.println("The binary input is: " + Integer.toBinaryString(n) + ". Which bit you want to reset?");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        input.close();

        String binary = Integer.toBinaryString(n);
        String maskString = String.format("%0" + (binary.length()) + "d", 0).replace('0', '1');

        int mask = Integer.parseInt(maskString);

        int ans = setIthBitToZero(mask, userInput);
        String ansBinaryString = Integer.toBinaryString(ans);
        ansBinaryString = ansBinaryString.substring(ansBinaryString.length() - binary.length());
        int finalVal = Integer.parseInt(ansBinaryString, 2);

        int finalAns = n & finalVal;
        System.out.println(Integer.toBinaryString(finalAns));
    }

    static int setIthBitToZero(int n, int i) {
        int mask = ~(1 << i - 1);
        return mask;
    }
}
