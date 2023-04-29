package ArrayList;
import java.util.Arrays;

public class WildCards<Type extends Number>{
    private Type[] data; // Changed to Type[]
    static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildCards(){
        this.data = (Type[]) new Object[DEFAULT_SIZE];
    }

    public void add(Type num){
        if(isFull()){
            resize();
        }

        data[size++] = num;
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        Type[] temp = (Type[]) new Object[data.length*2]; 
        // Copy the current items in the new array
        for(int i=0; i<data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public Type remove(int index) {
        Type removed = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null;
        return removed;
    }
    

    public int size(){
        return size;
    }

    public Type get(int index){
        return data[index];
    }

    public void set(int index, Type value){ 
        data[index] = value;
    }

    @Override
    public String toString(){
        return "WildCards{" + "data=" + Arrays.toString(data) + ", size=" + size + "}";
    }

    public static void main(String[] args) {
        // WildCards<Integer> list = new WildCards<>();
        // list.add(2);
        // list.add(4);
        // System.out.println(list);
        // list.remove(1);
        // System.out.println(list);

        // The following will throw an error now

        // WildCards<String> list2 = new WildCards<>();
        // list2.add("hey");
        // list2.add("hello");
        // System.out.println(list2);

    }

}

/*
_________________________________________________________________________________
Wildcards means that you restrict the Type to only accept a certain type of parameter so for example if you ctrl+click on the Integer then you will get to know that the Integer is a class that extends a Number class... Also Float is also extending the Number class only... So to restrict the generic to accept only the Number we can you something called wildcards of java as shown in this example
_________________________________________________________________________________
Here "Type" should either be Number or subclasses of Number...
WildCards<Number> list = new WildCards<>();
_________________________________________________________________________________
 */
