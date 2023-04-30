package CircularLinkedList;
public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);

        list.display();
        System.out.println();

        list.insertAt(5, 2);
        list.display();
        System.out.println();

        list.deleteFirst();
        list.display();
        System.out.println();

        list.deleteAt(1);
        list.display();
        System.out.println();
    }
}
