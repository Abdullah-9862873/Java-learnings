package New;

import java.util.List;
import java.util.ArrayList;

public class BinaryWatch {
    public static void main(String[] args) {
        int turnedOn = 8;

        List<String> ans = new ArrayList<>();

        for (int i = 0; i <= 11; i++) {
            for (int j = 0; j <= 59; j++) {
                // I have got every combination of time
                // Now convert it to binary
                String firstStr = Integer.toBinaryString(i);
                String secondStr = Integer.toBinaryString(j);

                // Counting the one's in these strings
                int count = 0;
                for (int k = 0; k < firstStr.length(); k++) {
                    if (firstStr.charAt(k) == '1') {
                        count++;
                    }
                }
                for (int k = 0; k < secondStr.length(); k++) {
                    if (secondStr.charAt(k) == '1') {
                        count++;
                    }
                }
                if (count == turnedOn) {
                    // Add the i and j to list
                    ans.add(String.format("%01d:%02d", i, j));
                }
            }
        }
        System.out.println(ans);

    }
}