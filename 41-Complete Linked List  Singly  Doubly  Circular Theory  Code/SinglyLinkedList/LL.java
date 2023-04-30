package SinglyLinkedList;

public class LL{
    private Node head;
    private Node tail;

    private int size = 0;
    public LL(){
        this.size = 0;
    }

    public void display(){
        Node temp = head;       // Here temp will start pointing to the same node where head is pointing in the heap memory
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("End");
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        // If it is the first item being added
        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public void insertAtEnd(int val){
        if(tail == null){
            insertFirst(val);
        }else{
            Node node = new Node(val);
            tail.next = node;
            tail = node;
        }

        size+=1;
    }

    public void insertAt(int val, int index){
        if(index == size){
            insertAtEnd(val);
            return;
        }
        if(index == 0){
            insertFirst(val);
            return;
        }
 
        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        
        Node node = new Node(val, temp.next);
        temp.next = node;

        size +=1;
        return;
    }

    public void insertUsingRecursion(int val, int index){
        insertUsingRecursion(val, index-1, head);
    }

    public Node insertUsingRecursion(int val, int index, Node currNode){
        if(index == 0){
            Node temp = new Node(val);
            temp.next = currNode.next;
            currNode.next = temp;
            return currNode;
        }

        currNode.next = insertUsingRecursion(val, index-1, currNode.next);
        return currNode;
    }

    // Delete
    public void deleteFirst(){
        if(head == null){
            return;
        }
        head = head.next;
        size -=1;
    }

    public void deleteEnd(){
        if(size == 0){
            return;
        }
        if(size == 1){
            deleteFirst();
            return;
        }

        Node temp = head;
        for(int i=1; i<(size-1); i++){
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
        size -=1;
    }

    public void deleteAt(int index){
        if(index == size-1){
            deleteEnd();
            return;
        }
        if(index == 0){
            deleteFirst();
            return;
        }

        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }

        // And my temp is at the index before the node which I want to delete
        temp.next = temp.next.next;
        size -= 1;
    }

    // Find 
    public Node find(int val){
        Node temp = head;
        while(temp != null){
            if(temp.value == val){
                return temp;
            }
            temp = temp.next;
        }
        return temp;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
