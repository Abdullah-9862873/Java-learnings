import java.util.Scanner;

public class PrimeNumbersTillN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        input.close();

        System.out.println("Prime numbers till " + n + " are: ");
        printPrimeNumbers(n, 2);
    }

    static void printPrimeNumbers(int n, int i) {
        if (i > n) {
            return;
        }

        if (isPrime(i, 2)) {
            System.out.print(i + " ");
        }
        printPrimeNumbers(n, i + 1);
    }

    static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return (n == 2) ? true : false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }

        return isPrime(n, i + 1);
    }
}