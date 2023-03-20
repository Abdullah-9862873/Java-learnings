package Questions;

public class FindUniqueNumbersFromOddNumberOfArray {
    public static void main(String[] args) {
        int[] arr = { 8, 8, 9, 1, 1, 1, 8, 9, 9, 2 };

        // Find the greatest element
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        // Convert the maximum number to binary and see how many bits it has
        String binary = Integer.toBinaryString(max);
        int count = binary.length();

        // Run the loop the number of bits times and each time get the first bit of the
        // numbr from array and keep adding that and when all of them gets added then
        // take modulo with 3 and add the answer to the String

        String finalAnsString = "";

        for (int i = 1; i <= count; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                // Convert the arr[i] to binary
                String binaryNum = Integer.toBinaryString(arr[j]);
                // Check if the binary number has enough bits, if not, skip this number
                if (binaryNum.length() < i) {
                    continue;
                }
                // Take the ith bit and keep adding it into a variable sum
                int lastBit = Integer.parseInt(Character.toString(binaryNum.charAt(binaryNum.length() - i)));
                sum += lastBit;
            }
            int ans = sum % 3;
            finalAnsString = ans + finalAnsString;
        }

        int finalAns = Integer.parseInt(finalAnsString, 2);
        System.out.println(finalAns);
    }
}

/*
 * If I add the similar numbers lets say in this case as the numbers are
 * repeating 3 times so if I add the bits of all the repeating numbers then the
 * resulting bits will be divisible by 3...
 * 
 * Now If a number gets added into it then the resulting bits will not be
 * divisible by 3
 * 
 * But If I take the modulo of the resulting bits with 3 then the answer will be
 * the number that is unique
 * 
 * Explanation--------------->
 * --10
 * --10
 * --10
 * -111
 * -111
 * 1000
 * -111
 * 1000
 * 1000
 * _________
 * 3363
 * 
 * So this resulting is divisible by 3
 * 
 * Now if unique number also gets added then the answer would be
 * --10
 * --10
 * --10
 * --11
 * -111
 * -111
 * 1000
 * -111
 * 1000
 * 1000
 * ________
 * 3374
 * 
 * Now If I take the modulo of it using 3 then the answer would be
 * 
 * 0011
 * 
 * Which is equal to 3 which is answer
 */
