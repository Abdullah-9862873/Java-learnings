public class Polymorphism {
    public static void main(String[] args) {
        //_____________________________________________________________________FROM
        // Shapes shape = new Shapes();
        // shape.area();

        // Shapes circle = new Circle();
        // circle.area();

        // Shapes square = new Square();
        // square.area();
        //_____________________________________________________________________TO
        //_____________________________________________________________________FROM
        

    }    
}

class Shapes{
    void area(){
        System.out.println("I am in shapes");
    }
}

class Circle extends Shapes{
    void area(){
        System.out.println("The area is pir * r^2");
    }
}

class Square extends Shapes{
    void area(){
        System.out.println("The area is square of a side");
    }
}

class Triangle extends Shapes{
    void area(){
        System.out.println("The area is 0.5 * b * h");
    }
}

class Box{
    double l;
    double w;
    double h;

    Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    Box(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    static void greeting(){
        System.out.println("I am in the Box Class");
    }
}

class BoxWeight extends Box{
    double weight;

    BoxWeight(double l, double w, double h, double weight){
        super(l,w,h);
        this.weight = weight;
    }
    
    BoxWeight(){
        this.weight = -1;
    }

    static void greeting(){
        System.out.println("I am in the BoxWeight class");
    }


}

/*
____________________________________________________________________________________________________________
----> Polymorphism is derived from "Poly" which means "many" and "morphism" which means "ways to represent"

____________________________________________________________________________________________________________
----> In this "area" example, we have like there is a function "area" that is represented in various forms inside the classes...
----> There is another example you can take, like in the inheritance file when we were creating the constuctors with different number of arguments... So like when a constructor is called with one argument then the class decides that ohh we should run this one... And if the constructor is called with two arguments then the class knows that we have to call which constructor... So the same constructor was represented in many different ways...

____________________________________________________________________________________________________________
----> Following are the types of polymorphism
____________________________________________________________________________________________________________

1- Compile Time / Static Polymorphism
----> Achieved via method overloading

----> Method overloading is same name of methods but the "types", "arguments", "types of arguments", "return types" and "ordering(Order of the type of arguments)" can be different. Example: Multiple constructors
____________________________________________________________________________________________________________

2- RunTime / Dynamic Polymorphism
----> When the parent class and the child class has same method then that is called overriding and this is basically known as polymorphism as the same method has more than one ways to represent in classes...

----> We have seen something like, the variables and stuff that a reference varaible can access depends on its type like which class it refer to.... But in case of overriding, the method it will call will be the method of object. For example

        Shapes shape = new Shapes();
        shape.area();

        Shapes circle = new Circle();
        circle.area();

Here the shape.area() will call the method "area" defined in Shape... But the circle.area(), despite the fact that the circle is a reference variable of class Shapes... It will still call the "area()" defined in "Circle" as the object is of type Circle... But if you remove the method "area" from the "Shapes" class then it will throw an error... Because then, it will look for not the overriding, but method "area" defined in the class "Shape"

Upcasting-----> This calling of the method defined in the object class, despite the fact that the reference variable of that object is of Type Parent class... It is known as upcasting
____________________________________________________________________________________________________________

----> How java determines which method to run?? 
----> It determines it via Dynamic Method Dispatch

Dynamic Method Dispatch ----> Call to an overridden method is resolved at runtime rather than the compile time...

____________________________________________________________________________________________________________
----> You cannot override a method that is final... So if you make the method "area" a final method... Then you cannot use it downwards... This enhances the performance... As the overriding happends at runtime so the java compiler when making the class file will know that this is the only method it cannot be overridden then it wont make further checks which saves time and improves performance...
----> Handling of final methods in Java happens at compile time

----> If you remove the final keyword from a method in the parent class and override it in the child class, then the handling of which method to run happens at runtime.
____________________________________________________________________________________________________________
------Early and Late Binding------
-----> In late binding, also known as dynamic binding or runtime polymorphism, the method call is resolved at runtime based on the actual object type. This means that the method to be called is determined at runtime based on the actual type of the object, rather than the type of the reference variable.

-----> when a method is declared as final in the parent class, it is resolved at compile time using early binding, since it cannot be overridden by the child classes.

____________________________________________________________________________________________________________
----> To prevent a class from being inherited you have to put it final.... When a class is made final then all its methods are made final too...
____________________________________________________________________________________________________________
----> If you make a method static in the parent class, And that same method you make in the child class and you call it something like the following

Parent obj = new Child();
obj.method();

Now this will not call the method specified in the object rather this will call the static method specified in the parent class... Because the static method is not dependent on the Class, hence it is the one who will always gets called...
____________________________________________________________________________________________________________

----> Overriding depends on objects, static methods are independent of objects, hence static methods cannot be overriden

____________________________________________________________________________________________________________
----> Polymorphism is not applied to the instance variables...

*/
