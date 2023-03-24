/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, return the Hamming distance between them.

 

Example 1:

Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.
*/

/*
If the corresponding bits are different then only the count will gets updated so XOR is done here
 */

package New;

public class HammingDistance {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;

        int val = x ^ y;

        // Keep doing the right shift until you get zero and count the 1's if present
        int count = 0;
        while (val > 0) {
            int lastBit = val & 1;
            if (lastBit != 0) {
                count++;
            }
            val >>= 1;
        }

        System.out.println(count);
    }
}
