package DoublyLinkedList;

public class DLL {
    private Node head;
    private Node tail;

    private int size;
    public DLL(){
        size = 0;
    }

    // Display
    public void display(){
        if(size == 0){
            return;
        }

        Node temp = head;
        System.out.print("Null <-> ");
        while(temp != null){
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("Null");
        return;
    }

    // Insert 
    public void insertFirst(int val){
        Node node = new Node(val);
        if(size != 0){
            node.next = head;
            head.prev = node;
            head = node;
        }
        if(size == 0){
            head = node;
            tail = head;
        }
        size += 1;
        return;
    }

    public void insertEnd(int val){
        if(size == 0){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        Node temp = head;
        for(int i=1; i<size; i++){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        tail = node;
        size +=1;
        return;
    }

    public void insertAt(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == (size-1)){
            insertEnd(val);
            return;
        }

        // Create a Node
        Node node = new Node(val);
        // Reach at the (index-1) node
        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        // Temp is at (index-1)th position

        // Make the next of the node to the next of the temp
        node.next = temp.next;

        // Make the previous of the node to the temp
        node.prev = temp;

        // Make the next of the temp to the node
        temp.next = node;

        // Access the next element i-e after the temp, and make its previous to the node
        temp.next.prev = node;

        size += 1;
        return;
    }

    // Delete
    public void deleteFirst(){
        if(size == 0){
            return;
        }

        Node temp = head.next;
        temp.prev = null;
        head = temp;
        size -= 1;
        return;
    }

    public void deleteEnd(){
        if(size == 0){
            return;
        }

        if(size == 1){
            deleteFirst();
            return;
        }

        // React at the second last index and make it temp
        Node temp = head;
        for(int i=1; i<(size-1); i++){
            temp = temp.next;
        }

        // Make the next of the temp to the null
        temp.next = null;

        // Make the temp, new tail of linked list
        tail = temp;

        size -= 1;
        return;
    }

    public void deleteAt(int index){
        if(index == 0){
            deleteFirst();
            return;
        }
        if(index == (size-1)){
            deleteEnd();
            return;
        }

        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        temp.next.prev = temp;
        size -= 1;
        return;
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        Node(int value){
            this.value = value;
        }
    }
}
