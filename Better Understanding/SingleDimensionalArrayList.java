import java.util.Scanner;
import java.util.ArrayList;

public class SingleDimensionalArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array list: ");
        int size = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>(size);

        // input
        boolean isTrue = true;

        while (isTrue) {
            System.out.println("Enter the values of list... Enter -999 to exit");
            list.add(input.nextInt());
            if (list.get(list.size() - 1) == -999) {
                list.remove(list.size() - 1);
                break;
            }
        }
        input.close();

        // output
        System.out.println("The values you entered in the list are: ");
        System.out.print(list);

    }
}
