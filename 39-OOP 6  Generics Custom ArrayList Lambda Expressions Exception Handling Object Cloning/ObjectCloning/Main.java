package ObjectCloning;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human abdullah = new Human(21, "Abdullah Sultan");
        // Human twin = new Human(abdullah);

        // System.out.println(twin.age);

        Human twin = (Human)(abdullah.clone());
        System.out.println(twin.age);
        twin.age = 100;
        System.out.println(abdullah.age);

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(abdullah.arr));
        System.out.println(Arrays.toString(twin.arr));



    }
}

/*
___________________________________________________________________________
---> To clone the object we can do something like the following

public class Human {
    int age;
    String name;
    
    Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }
}

public class Main {
    public static void main(String[] args) {
        Human abdullah = new Human(21, "Abdullah Sultan");
        Human twin = new Human(abdullah);

        System.out.println(twin.age);
    }
}

___________________________________________________________________________
----> In java there is an interface called "Clonable" so we must implement that by the class whose clone we want to create...

___________________________________________________________________________
----> Here again if I don't do throws exception then it will say unhandled exception error... Because I am using a clone method of Object class which is being overriden inside the Human class... So basically this will call the clone() method of Human class which is throwing exception, so the exception needs to be handled in the main class...
___________________________________________________________________________
----> CloneNotSupportedException will get thrown if we don't implement the interface Clonable in the class whose clone we want to make...
___________________________________________________________________________
----> A shallow copy creates a new object and then copies the non-static fields of the current object to the new object. If a field is a reference type, then the reference is copied, not the object itself. This means that the original object and the copy share the same reference to the same object. In other words, a shallow copy creates a new object with the same field values as the original object, but it does not create new copies of the referenced objects.

----> A deep copy will create a new object and this will not make any pointing to the original object rather it will make new copies of all the fields and the references either primitive or non primitive in it... So a change in the copied one will be reflected in the copied itself rather than the original one...
___________________________________________________________________________
 */
