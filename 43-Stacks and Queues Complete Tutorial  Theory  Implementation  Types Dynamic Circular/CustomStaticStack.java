
public class CustomStaticStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStaticStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStaticStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("The Stack is full so Item cannot be inserted");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack!!!");
        }
        int removedItem = data[ptr];
        ptr--;
        return removedItem;
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot get the peek of an empty stack!!!");
        }

        return data[ptr];
    }

    private boolean isFull(){
        // If ptr is at last index then you cannot do ptr++ 
        if(ptr == (data.length-1)){
            return true;
        }
        return false;
    }

    private boolean isEmpty(){
        if(ptr == -1){
            return true;
        }
        return false;
    }

    
}
