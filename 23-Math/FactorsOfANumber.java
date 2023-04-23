import java.util.ArrayList;

public class FactorsOfANumber {
    public static void main(String[] args) {

        factors3(36);
    }

    // O(N) ----> Time complexity && O(1) ----> Space complexity
    static void factors1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // O(sqrt(n))--------> Time complexity ||||||||||||||O(1) -----> SpaceComplexity
    static void factors2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    // In that case print the value once
                    System.out.println(i + " ");
                } else {
                    System.out.print(i + " " + (n / i) + " ");
                }
            }
        }
    }

    // O(sqrt(n))--------> Time complexity ||||||||||||||O(1) -----> SpaceComplexity
    static void factors3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    // In that case print the value once
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(0, n / i);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
