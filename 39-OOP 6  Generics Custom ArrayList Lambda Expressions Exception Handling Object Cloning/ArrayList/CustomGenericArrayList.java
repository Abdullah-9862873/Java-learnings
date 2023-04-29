package ArrayList;
import java.util.Arrays;

public class CustomGenericArrayList<Type>{
    private Type[] data; // Changed to Type[]
    static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArrayList(){
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
        return "CustomGenericArrayList{" + "data=" + Arrays.toString(data) + ", size=" + size + "}";
    }

    public static void main(String[] args) {
        // CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        // list.add(2);
        // list.add(4);
        // System.out.println(list);
        // list.remove(1);
        // System.out.println(list);

        CustomGenericArrayList<String> list2 = new CustomGenericArrayList<>();
        list2.add("hey");
        list2.add("hello");

        System.out.println(list2);

    }

}

/*
_________________________________________________________________________________
----> The following will throw an error

 public CustomGenericArrayList(){
        this.data = new Type[DEFAULT_SIZE];
    }

This is because the generics are assigned at the compile time but the creation of object is done at runtime so at runTime the byte code will get confused that what is this "Type" thing

In Java, generics are a compile-time feature, which means that the actual type of the generic parameter is erased at runtime and replaced with the appropriate type based on the context in which it is used. In the case of the CustomGenericArrayList class, the Type parameter is used to create an array of that type in the constructor. However, at runtime, the type of Type is erased, and the byte code will not know what type of array to create, hence it will throw an error.
_________________________________________________________________________________
 */

