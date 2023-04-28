public class Inheritance{
    public static void main(String[] args) {
        //_________________________________________________________________From
        // Box2 obj = new Box2();
        // System.out.println(obj.l + " " + obj.w + " " + obj.h + " " + obj.weight);
        // obj.weight = 2;
        // obj.l = 20;
        // obj.w = 90;
        // obj.h = 45;
        // System.out.println(obj.l + " " + obj.w + " " + obj.h + " " + obj.weight);
        
        // Box2 obj2 = new Box2();
        // System.out.println(obj2.l + " " + obj2.w + " " + obj2.h + " " + obj2.weight);

        // obj2.information();

        //_________________________________________________________________To
        //_________________________________________________________________From
        // Box2 obj1 = new Box2(12,23,34,45);
        // System.out.println(obj1.l + " " + obj1.w + " " + obj1.h + " " + obj1.weight);
        //_________________________________________________________________To
        //_________________________________________________________________From
        // The following will throw an error explained below
        //     Box obj1 = new Box2(12,23,34,45);
        // System.out.println(obj1.weight);
        //_________________________________________________________________To
        //_________________________________________________________________From
        // The following will throw an error too
        // Box2 obj1 = new Box(12,23,34);

        //_________________________________________________________________To


    }
}

class Box{
    double l;
    double w;
    double h;
    double salary;

    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
        this.salary = side;
    }

    Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
        this.salary = 10000;
    }

    Box(double side1, double side2, double side3){
        this.l = side1;
        this.w = side2;
        this.h = side3;
    }

    Box(Box otherObj){
        this.l = otherObj.l;
        this.w = otherObj.w;
        this.h = otherObj.h;
    }

    public void information(){
        System.out.println("Running the Box Class");
    }
}

class Box2 extends Box{
    double weight;
    double salary;

    Box2(){
        this.weight = -1;
        this.salary = -1;
    }
    Box2(int weight){
        this.weight = weight;
    }
    Box2(int weight, int salary){
        this.weight = weight;
        this.salary = salary;
    }

    Box2(double l, double w, double h, double weight, int salary){
        super(l,w,h);

        System.out.println(super.salary);       // This will refer to the salary defined in parent class
        System.out.println(this.salary);        // This will refer to the salary of this class
        this.weight = weight;
    }

    Box2(Box2 other){
        super(other);
        this.weight = other.weight;
    }
}


/*
_____________________________________________________________________________
----> Child class means that it will have all the properties of the base class + it will have its own properties
_____________________________________________________________________________
----> In the following constructor call:
Box2(double l, double w, double h, double weight){
        super(l,w,h);
        this.weight = weight;
    }

----> I have used something called "super"... This super keyword is used to initialise the values present in the parent class... So this will initialise them to the values entered by the user, and the weight value I have initialised to the weight that user enters

----> The super keyword in here is referencing to the following in the parent class:
Box(double side1, double side2, double side3){
        this.l = side1;
        this.w = side2;
        this.h = side3;
    }
_____________________________________________________________________________
----> If you make a variable private, then that variable will only be used inside that particular class... You cannot access that class outside even if you extend still you can't use it in child class.
_____________________________________________________________________________
----> You cannot do the following in it
Box obj1 = new Box2(12,23,34,45);
    System.out.println(obj1.weight);

----> This will show error because, the reference variable obj1 is basically an object of type Box and the Box is the parent class while the weight property is the property of the child class which the parent class cannot access... This is why is is showing error... 
----> NOTE: The child class can access the properties of the parent classes but the parent class cannot access the properties of child class...
_____________________________________________________________________________
Box2 obj1 = new Box(12,23,34);

----> Over here, I have a reference variable of child class... And the object is of parent class... Notice that the child class has only weight but as it extends parent class so it can use the variables of parent class... But when the reference variable is of type child class, so it needs to initialise the variables of child class in order to use it... But as the object is of parent class so it don't have any access of the child's weight variable.. Thus it will give an error
_____________________________________________________________________________

Super keyword-----> Super keyword is used to access the class that is just above it... so for example, if a class A has a class B which further has a class C... Then the super keyword defined in the C class, will refer to the B class, and the super keyword defined in the B class will refer to the A class... But the super keyword defined in the A class that is the highest parent class will refer to an Object Class... This is specified in java that every class refer to the Object class... And by every class I mean the classes that you define or the classes that are builtin in java like Arrays classes and all...

_____________________________________________________________________________
----> Parent class needs to be initialised first then you can initialise the child class variables... Because child class do care what parent class have but parent class does not care while child class has... So for example the following will throw an error:

    Box2(double l, double w, double h, double weight, int salary){
        this.weight = weight;
        super(l,w,h);
    }

    so to correct it super keyword should be placed first
    Box2(double l, double w, double h, double weight, int salary){
        super(l,w,h);
        this.weight = weight;
    }
_____________________________________________________________________________

----> The following will throw an error 
Box2(Box2 other){
        super(other);
        this.weight = other.weight;
    }

This is the same error as above... Because the "other" is an object of type "Box2" which is child class... Inside of it... I have super keyword that has paremeter of "other" object.... This super will be replaced by the parent class i-e "Box" so it would be something like the "Box(other)" and as I have defined the constructor in the parent class

    Box(Box otherObj){
        this.l = otherObj.l;
        this.w = otherObj.w;
        this.h = otherObj.h;
    }

This will get invoked... so Box(Box2 other) means that the reference variable is of type parent class... But the object is of type child class like the following


Box obj1 = new Box2(12,23,34,45);

So you cannot access the (obj1.weight) bcz the obj1 is of type parent class which doesn't know what is defined in the child class...
_____________________________________________________________________________
----> To check whether a method is overriden or not simply write "@Override" above that method and if you see a red line under it that means that it is not overriden otherwise it is overriden


*/