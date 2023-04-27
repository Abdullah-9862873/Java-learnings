public class WrapperExample_finalKeyword_FinalizeKeyword {
 public static void main(String[] args) {
    int a = 10;

    Integer b = 20;

    //______________________________________________________________From

    // Will throw an error

    // final int increase = 2;
    // increase = 4;

    //______________________________________________________________To

    //______________________________________________________________From
    // final Student st1 = new Student("Abdullah");

    // When a non primitive dataType is final, then you cannot reassign it
    // st1 = new Student("Ahmed");
    // System.out.println(st1.name);

    //______________________________________________________________To
    //______________________________________________________________From
    Student obj1;

    for(int i=0; i<10000000; i++){
        obj1 = new Student("Abdullah");
    }

    // Here I have taken a large number to put some load on the memory so basically forcing it to use garbage collector
    //______________________________________________________________T0
 }   
}

class Student{
    String name;
    
    Student(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}

/*
__________________________________________________________________________________
----> Here at first when we did (int a = 10) then it is stored in the stack memory and here there is no object... The "a" is not an object
----> But in second case (Integer b = 20) the b is an object and if you do b(dot) then you can access the properties and functions of the Integer class

__________________________________________________________________________________
----> "final" is a keyword, that prevents for the original content to be modified so it's like constants
__________________________________________________________________________________
----> We have learned so far, that if you create an object then that object will have a memory in the heap memory or the actual value in the heap memory and the "reference variable" in the stack memory which is basically pointing to the heap memory.
And if we create another object and point that object to where the first object is pointing to so like

String a = "Hey";
String b = a;

----> Then if we modifiy it using "b" then it will reflect in the original changes... But in primitives, its not possible as the primitives are final classes that cannot get changed

----> Even if you create a swap(Integer a, Integer b) and pass some primitive object integers in it then they will not get swapped and the reason is that there is no such thing as pass by reference for primitives in java... There is only pass by value...

---> For Example, the following will give an error
    final int increase = 2;
    increase = 4;

----> "final" variable must always be initialised where it is declared... It's not possible to only declare it and then initialise it somewhere else
__________________________________________________________________________________
---> One more interesting thing about "final" is that:

---> The immutability that the "final" dataType cannot be modified or it must be initialised while declaring is only true for the primitive dataTypes like int,float,...
---> If you make a class "final" then you can initialise it somewhere else but you cannot reassign it

____________________________Finalised_Keyword_______________________________
-----> Finalised keyword is java is... So basically in C++, there is a destructor which allows the user to destroy the objects which are not being used in the memory anymore... But Java does not allow this, rather what java does is, that it destroys the objects or things in the memory automatically when they are not being required... And this is done via "Garbage Collector"

----> But used the finalize keyword, we can say something like "Okay java I know you won't allow me to destroy the object and stuff but when you decide to destroy it then do this thing..." So that thing which we want it to do after destruction can be specified in finalize

----> In the given case when any object of class Student is destroyed then finalize will be executed

 */
