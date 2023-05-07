public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 5;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }

    protected int frontPtr = -1;
    protected int endPtr = -1;
    protected int size = 0;

    // insert an item
    public boolean insert(int item){
        if(isFull()){
            endPtr = endPtr % data.length;
            data[endPtr] = item;
            frontPtr++;
            size++;
            return true;
        }
        if(frontPtr == -1){
            frontPtr = 0;
        }
        endPtr++;
        data[endPtr] = item;
        size++;
        return true;
    }

    public int removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot remove from an empty queue");
        }
        if(frontPtr == data.length-1){
            int removedItem = data[frontPtr];
            frontPtr++;
            frontPtr = frontPtr % data.length;
            size--;
            return removedItem;
        }
        int removedItem = data[frontPtr];
        frontPtr++;
        size--;
        return removedItem;
    }

    // display
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        int temp = frontPtr;
        
        while(true){
            if(temp == endPtr){
                System.out.println(data[temp]);
                break;
            }
            if(temp == data.length){
                temp = temp % data.length;
                if(temp == endPtr){
                    System.out.println(data[temp]);
                    break;
                }
            }
            System.out.println(data[temp]);
            temp++;
        }
    }

    private boolean isFull(){
        if(size == data.length){
            return true;
        }
        return false;
    }

    private boolean isEmpty(){
        return size == 0;
    }
}
