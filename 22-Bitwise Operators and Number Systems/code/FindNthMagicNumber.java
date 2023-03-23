package Questions.Old;

public class FindNthMagicNumber {
    public static void main(String[] args) {
        int n = 4;

        // Convert the number to binary

        String binary = Integer.toBinaryString(n);

        // Traverse the string to the length
        int ans = 0;
        for (int i = 1; i <= binary.length(); i++) {
            int lastBit = Integer.parseInt(Character.toString(binary.charAt(binary.length() - i)));
            ans = ans + (lastBit * (int) Math.pow(5, i));
        }
        System.out.println(ans);

    }
}

/*
 * Magic number is basically lets say you have the input 4
 * 
 * Step 1------> Convert it to binary
 * ------------> 100
 * ------------> (1)*(5^3) + (0)*(5^2) + (0)*(5^1)
 * ------------> 125 + 0 + 0
 * ------------> 125
 */
