import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int ans = fact(n);
        System.out.println(ans);

        input.close();
    }

    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }

        return (n * fact(n-1));
    }
}
