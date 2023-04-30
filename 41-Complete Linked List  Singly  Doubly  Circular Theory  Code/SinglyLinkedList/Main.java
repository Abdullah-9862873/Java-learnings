package SinglyLinkedList;
public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        // list.insertFirst(4);
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(1);
        // list.insertAtEnd(99);

        // list.display();
        // System.out.println();

        // list.insertAt(101, 2);

        // list.display();
        // System.out.println();

        // list.insertAt(1000, 6);
        // list.display();
        // System.out.println();

        // list.deleteFirst();
        // list.display();
        // System.out.println();

        // list.deleteEnd();
        // list.display();
        // System.out.println();

        // list.deleteAt(4);
        // list.display();
        // System.out.println();

        // The following will give me the reference to that Node which conatins the "val" and to use the following I have to make the "Node" of the "LL" class "public static"
        // LL.Node ans = list.find(2);
        // System.out.println(ans);

        list.insertFirst(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);

        list.display();
        System.out.println();

        list.insertUsingRecursion(5, 2);
        list.display();
        System.out.println();

    }
}
