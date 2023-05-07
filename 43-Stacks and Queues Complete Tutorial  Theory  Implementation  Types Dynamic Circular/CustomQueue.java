public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int endPtr = -1;

    public boolean insert(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is Full!!!");
        }
        endPtr++;
        data[endPtr] = item;
        return true;
    }

    public int removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty queue");
        }
        // Otherwise as we want to pop the first item from the array like FIFO and LILO manner we will shift all the elements to the left so that the last element will be 0 
        int removedItem = data[0];
        for(int i=1; i<data.length; i++){
            data[i-1] = data[i];
        }
        endPtr--;
        return removedItem;
    }

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data = new int[size];
    }

    private boolean isFull(){
        if(endPtr == data.length-1){
            return true;
        }
        return false;
    }

    private boolean isEmpty(){
        return endPtr == -1;
    }
}

/*
________________________________________________________________________________________________
----> There's a problem with the customeQueue which is that removing an item takes O(n) time which is not good... It is taking this much time because all the n items need to get shifted towards left
----> To solve this there is a concept "Circular Queue"
________________________________________________________________________________________________
 */
