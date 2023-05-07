
public class Main {
    public static void main(String[] args) throws Exception{
        // CustomStaticStack stack = new CustomStaticStack(5);
        // stack.push(12);
        // stack.push(13);
        // stack.push(14);
        // stack.push(15);
        // stack.push(16);

        
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        //____________________________________________________________________________

        // DynamicStack stack = new DynamicStack();
        // stack.push(12);
        // stack.push(13);
        // stack.push(14);
        // stack.push(15);
        // stack.push(16);
        // stack.push(17);
        // stack.push(18);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        //____________________________________________________________________________
        // CustomQueue queue = new CustomQueue();
        // queue.insert(1);
        // queue.insert(2);
        // queue.insert(3);
        // queue.insert(4);
        // queue.insert(5);

        // System.out.println(queue.removeFirst());
        // System.out.println(queue.removeFirst());
        // System.out.println(queue.removeFirst());
        // System.out.println(queue.removeFirst());
        // System.out.println(queue.removeFirst());
        //____________________________________________________________________________
        // CircularQueue queue = new CircularQueue();
        // queue.insert(1);
        // queue.insert(2);
        // queue.insert(3);
        // queue.insert(4);
        // queue.insert(5);

        // queue.display();
        // System.out.println();

        // queue.removeFirst();
        // queue.removeFirst();
        // queue.removeFirst();
        // queue.removeFirst();
        // queue.removeFirst();
        
        // queue.display();
        // System.out.println();

        //____________________________________________________________________________
        // DynamicQueue queue = new DynamicQueue();
        // queue.insert(1);
        // queue.insert(2);
        // queue.insert(3);
        // queue.insert(4);
        // queue.insert(5);
        // queue.insert(6);

        // queue.display();
        // System.out.println();

        // queue.removeFirst();
        // queue.removeFirst();
        // queue.removeFirst();
        // queue.removeFirst();

        // queue.display();
        // System.out.println();
    }
}

/*
________________________________________________________________________________________________
----> You can handle the exception in two ways...
----> One way is being used in the above code ----> public static void main(String[] args) throws StackException{
----> The other way is by using the try catch block as follows:
        try{
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        }catch(StackException e){
            System.out.println(e.getMessage());
        }
________________________________________________________________________________________________

 */
