package ArrayList;
import java.util.Arrays;

public class CustomArrayList{
    private int[] data;
    static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }

        data[size++] = num;
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        int[] temp = new int[data.length*2];
        // Copy the current items in the new array
        for(int i=0; i<data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove(int index) {
        int removed = data[index];
        // Shift elements to the left to fill the gap left by the removed element
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = 0; // Set the last element to 0 to avoid keeping a reference to an unused object
        return removed;
    }
    

    public int size(){
        return size;
    }

    public int get(int index){
        return data[index];
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString(){
        return "CustomArrayList{" + "data=" + Arrays.toString(data) + ", size=" + size + "}";
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(2);
        list.add(4);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }

}

/*
_________________________________________________________________________________
----> In this we will generate our own arrayList... How arrayList works is, that it generates a size lets say you asked it to generate a size of 10 in the arrayList... It will generate it but when you try to add the 11th entity in it... Then it will make a new arrayList which is double the size of the previous one 20 in this case... And it will copy all the 10 items from the first array list to the second one and put the new entity at the 11th place
_________________________________________________________________________________
----> The problem we are facing here is, that in the arraylist we specify that which type of arraylist we want so if we want like an array list of strings then we do something like the following

ArrayList<String> list = new ArrayList<>();

This is known as paraeterised creation of arrayList... But in our code we can't do that... To solve this problem we will use Generics
_________________________________________________________________________________
 */