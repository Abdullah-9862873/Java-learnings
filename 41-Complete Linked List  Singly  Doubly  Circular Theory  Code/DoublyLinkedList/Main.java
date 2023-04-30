package DoublyLinkedList;


public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(1);
        list.insertEnd(2);
        list.insertEnd(3);
        list.insertEnd(4);

        list.display();
        System.out.println();

        list.insertAt(5, 2);
        list.display();
        System.out.println();

        list.deleteFirst();
        list.display();
        System.out.println();

        list.deleteAt(2);
        list.display();
        System.out.println();
    }
}
