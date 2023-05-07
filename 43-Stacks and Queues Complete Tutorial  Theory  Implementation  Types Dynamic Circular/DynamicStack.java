public class DynamicStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 5;

    private int ptr = -1;

    public DynamicStack(){
        this.data = new int[DEFAULT_SIZE];
    }

    public boolean push(int item){
        if(isFull()){
            resize();
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException{
        if(ptr == -1){
            throw new StackException("Cannot Pop from an empty stack!!!");
        }
        int removedItem = data[ptr];
        ptr--;
        return removedItem;
    }

    private void resize(){
        int[] newArr = new int[data.length];
        int newPointer = 0;
        while(newPointer != data.length){
            newArr[newPointer] = data[newPointer];
            newPointer++;
        }
        this.data = new int[2*DEFAULT_SIZE];
        newPointer = 0;
        while(newPointer != newArr.length){
            data[newPointer] = newArr[newPointer];
            newPointer++;
        }
        ptr = newArr.length-1;
    }

    private boolean isFull(){
        if(ptr == data.length-1){
            // Pointer is at the last
            return true;
        }
        return false;
    }
}
