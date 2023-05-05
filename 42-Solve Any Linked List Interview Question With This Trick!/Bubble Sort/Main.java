
public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtEnd(1);
        list.insertAtEnd(5);
        list.insertAtEnd(4);
        list.insertAtEnd(3);
        list.insertAtEnd(2);

        list.display();
        System.out.println();

        list.Bubblesort();
        list.display();
        System.out.println();

    }
}
