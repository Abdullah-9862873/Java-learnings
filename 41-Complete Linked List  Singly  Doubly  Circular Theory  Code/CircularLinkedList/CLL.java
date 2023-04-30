package CircularLinkedList;
public class CLL {
    private Node head;
    private Node tail;

    private int size;
    public CLL(){
        size = 0;
    }

    //Display
    public void display(){
        if(size == 0){
            return;
        }

        Node temp = head;
        do{
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }while(temp.value != head.value);

        System.out.print("End");
        return;
    }

    // Insert
    public void insertFirst(int val){
        if(size != 0){
            Node node = new Node(val);
            tail.next = node;
            node.next = head;
            tail = node;
        }
        else if(size == 0){
            Node node = new Node(val);
            head = node;
            tail = node;
        }

        size += 1;
        return;
    }

    public void insertAt(int val, int index){
        if(index == 0 || index == (size-1)){
            insertFirst(val);
            return;
        }

        // Reach at the index-1 poisition
        Node node = new Node(val);
        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;

        size += 1;
        return;
    }

    // Delete
    public void deleteFirst(){
        if(size == 0){
            return;
        }

        Node temp = head;
        for(int i=1; i<(size-1); i++){
            temp = temp.next;
        }

        temp.next = head;
        tail = temp;
        size -= 1;
        return;
    }

    public void deleteAt(int index){
        if(index == 0 || index == (size-1)){
            deleteFirst();
            return;
        }

        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size -= 1;
        return;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }
}
