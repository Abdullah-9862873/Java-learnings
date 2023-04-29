package abstraction;

public abstract class Parent{
    abstract void career();
    abstract void partener();

    int age; 

    public Parent(int age){
        this.age = age;
    }

    static void hello(){
        System.out.println("Hey");
    }
    void normal(){
        System.out.println("This is a normal method");
    }
}




/*
_____________________________________________________________________________________________________________
Note---->In Abstract functions, no body of the function is allowed
_____________________________________________________________________________________________________________
Note----> Any class that has an abstract method will also have to be declared as abstract
Note----> Every child class has to override all the abstract methods of the parent class
Note----> If you definately know that the methods in the parent class needs to be overriden then just make them abstract
Note----> You cannot create objects of an abstract class directly


Syntax---> abstract type name (Arguments)
Example--> abstract void career(String name)
_____________________________________________________________________________________________________________
Note----> For abstract classes you cannot create objects like the following

Parent obj = new Parent();

rather you have to initialise all the abstract methods

Parent obj = new Parent(45){
            @Override
            void career(){

            }

            @Override
            void partener(){
                
            }
        };
_____________________________________________________________________________________________________________
Note---> Can you create an abstract constructor... NO you can't
Note---> Can you create an abstract static method.... NO, bcz the static methods cannot be overriden while the abstract methods needs to be overriden so you can't...

_____________________________________________________________________________________________________________
Note---> Can you create a static method in abstract class... Yes we made a method called "Hello"
_____________________________________________________________________________________________________________
Note---> Can you create a normal method in abstract class... Yes we made a method called "normal"
_____________________________________________________________________________________________________________
Note---> You can use something like the following

Parent obj = new Daughter();
obj.career();

And this will call the career of Daughter class

_____________________________________________________________________________________________________________
Note---> Abstract classes needs to be extended so that there methods can get overriden so that means that you cannot make an Abstract final class... Because final prevents the class from being inherited or extended...
_____________________________________________________________________________________________________________
Note---> You cannot access the instance variables of abstract parent class directly via object as the object of abstract parent class cannot be created so you can create a child class that extends the abstract class and there in the constructor you can have the value passed in the constructor of the parent class .... Like in the following code:

public abstract class MyAbstractClass {
    final int VALUE;

    public MyAbstractClass(int value) {
        this.VALUE = value;
    }
}

public class MySubclass extends MyAbstractClass {
    public MySubclass(int value) {
        super(value);
    }

    public void printValue() {
        System.out.println("VALUE = " + VALUE);
    }
}
_____________________________________________________________________________________________________________
 */