package Questions.Old;

public class PositionOfMostSetRightBit {
    public static void main(String[] args) {
        // Find the position of the most set right bit
        int n = 0b10110000;

        String binary = Integer.toBinaryString(n);
        System.out.println(binary.length());

        int count = 1;
        for (int i = 0; i < binary.length(); i++) {
            int num = 1 << i;
            if ((num & n) != 0) {
                break;
            }
            count++;

        }
        System.out.println(count);
    }
}
