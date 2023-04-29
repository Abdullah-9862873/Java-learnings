package pkg2_interface;


/*
_____________________________________________________________________________________________________________
There is a problem actually... For example, there is a class A and a class B... They both have functions like "fun()"... Now there is a class C that is basically extending both A and B... Now when you call fun() from the object of C class then who will it call... fun() of A class or B class... This is why Java does not support multiple inheritance...
_____________________________________________________________________________________________________________
----> Interfaces are something that contains abstract functions(That does not have a body)... It is like an abstract like but not completely
----> By default, the functions are public and abstract in the interfaces
----> By default, the variables are static and final in the interfaces
_____________________________________________________________________________________________________________
Difference between interfaces and classes

----> Interfaces can only have abstract methods... While abstract classes can have both abstract methods or normal methods...
----> The variables declared in interfaces are final... But the variables declared in abstract classes can be final and non final... Interfaces don't have constructors so they have final instance variables that needs to be initialised 
----> Abstract class can provide the implementation of interface but not vice versa...
----> Interfaces can be implemented using the "implements" keyword and in abstract classes you can simply extend
----> Interfaces can implement more than one classes but abstract class can only extend only single class..
----> Members of the interface class are public by default, but the abstract classes can have public, private or protected members
_____________________________________________________________________________________________________________
----> Two classes that are in any level of heirarchy can be implemented via a single class using interfraces... This is the power of interfaces
_____________________________________________________________________________________________________________
----> If there are classes like, if there is a interface "B" that extends an interface "A" and there is another class "C" that implements class "B"... 
Nw imagine that the interface "B" has a function "func()" and interface "A" has a function "greet()"... The when the class "C" implements the interface "B" then it would have to override both functions...

----> Classes to interface inheritance is done using "implements" while the interface-interface inheritance is done using "extends" so what we did is

public interface A{
    void func();
}

public interface B extends A{
    void greet();
}

public class C implements B{
    @Override
    public void func(){
        System.out.println("This is a func");
    }

    @Override
    public void greet(){
        System.out.println("This is a greet function");
    }
}
_____________________________________________________________________________________________________________
NOTE---> If you have a static method in an interface, then they should always have a body... Because if a method can be inherited, it means it can be overridden... That means it depends on objects... But static methods do not depend on objects so static methods in the interface needs to have a body.
----> And you have to call them via the interface name

public interface A{
    static void greet(){
        System.out.println("Hello there!");
    }
}

They cannot be something like
static void greet();
_____________________________________________________________________________________________________________
IN GENERAL NOT SPECIFIC TO INTERFACE----> If in the parent class, there is a protected method  called "greet()" and that method you have overridden in another class... Then the access modifier of the overridden class needs to be better or same... It can be public or protected but not private(i-e not more restrictive than before)
 */
