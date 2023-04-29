package ObjectCloning;
public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;
    
    Human(int age, String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,5,6,7};
    }

    Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        // This is a shallow copy
        return super.clone();
    }

    // @Override
    // public Object clone() throws CloneNotSupportedException{
    //     // This is a deep copy
    //     Human twin = (Human)super.clone();

    //     twin.arr = new int[twin.arr.length];
    //     for(int i=0; i<twin.arr.length; i++){
    //         twin.arr[i] = this.arr[i];
    //     }

    //     return twin;
    // }
}

/*
_________________________________________________________
---> Here basically what is happening is that Object has a method called clone() which basically clones all the fields and the object references... So when we call this clone method via an object... Then all the reference variables will get copied to the this new object... And now when you do something like "newObject." then you can access all the reference variables that point to the same location in the heap memory...

_________________________________________________________
----> Notice that we are overriding this clone() method from the Object class...
_________________________________________________________
----> We are throwing an exception which basically means that if the superclass of this class does not support cloning, then the subclass should not support it either, and the CloneNotSupportedException should be thrown... clone() is a protected method in the object class... which is throwing exception by default.. So we have to throw an exception too while overriding this clone() method...

---> So the following is generating a shallow copy
    @Override
    public Object clone() throws CloneNotSupportedException{
        // This is a shallow copy
        return super.clone();
    }



----> If I do this in the Main class
        Human abdullah = new Human(21, "Abdullah Sultan");
        Human twin = (Human)(abdullah.clone());
        System.out.println(twin.age);
        twin.age = 100;
        System.out.println(abdullah.age);

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(abdullah.arr));

then what happens will that it will not make the changes in the age of "abdullah" but it will reflect the change in the arr of "abdullah"...

So basically, This happens because the clone() method creates a shallow copy of the object, which means that it copies all of the object's fields, but not the objects referred to by those fields. In the case of Human, the age and name fields are primitive types, so when you modify them in the cloned object, they are not reflected in the original object. However, the arr field is an array, which is a reference type. When you modify the arr field in the cloned object, you are modifying the same array object that is referred to by the arr field in the original object.

----> Summary:  So for primitives like "int" in this case, it will make a new one so twin.age will change the age of that twin only... But for non primitives(String and arr in this case) it will just point to the original one...

_________________________________________________________
----> To create a deep copy you can do something like following where a twin obj is created every time when clone() of the object of the Human class will get triggered... And that twin's arr will be a new arr where all the values of the arr of the object class will get copied... and new twin will get returned...

    @Override
    public Object clone() throws CloneNotSupportedException{
        // This is a deep copy
        Human twin = (Human)super.clone();

        twin.arr = new int[twin.arr.length];
        for(int i=0; i<twin.arr.length; i++){
            twin.arr[i] = this.arr[i];
        }

        return twin;
    }
_________________________________________________________
 */
