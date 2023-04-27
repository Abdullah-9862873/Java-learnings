public class OOP_Class1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        // Student student2 = new Student(15,"Ahmed",95.5f);

        student1.rno = 12;
        student1.name = "Abdullah";
        student1.marks = 89.5f;

        // student1.greeting();

        // System.out.println(student1.rno);
        // System.out.println(student1.name);
        // System.out.println(student1.marks);

        // System.out.println(student2.rno);
        // System.out.println(student2.name);
        // System.out.println(student2.marks);


        // _____________________________________________________
        // Student obj1 = new Student(1, "Obj1Name", 90.0f);
        // Student obj2 = new Student (obj1);
        
        // System.out.println(obj2.rno);
        // System.out.println(obj2.name);
        // System.out.println(obj2.marks);

        // _____________________________________________________
        Student random = new Student();

        System.out.println(random.rno);
        System.out.println(random.name);
        System.out.println(random.marks);
    }
}

class Student {
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello! My name is: " + this.name);
    }

    // The following is the constructor that the java currently runs by default
    // Student(){
    //     this.rno = 12;
    //     this.name = "Abdullah";
    //     this.marks = 85.5f;
    // }

    // This is a constuctor by using which we can pass the arguments and make the changes in that object in a single line
    // Here, "this" will be replaced with the Reference variable, which is used in the code to declare and initialise the class Student
    Student(int roll, String naam, float marks){
        this.rno = roll;
        this.name = naam;
        this.marks = marks;
    }

    // Following is the constructor that you can call while passing another object as argument in it and this will take the properties or state of that object
    // So the object must be of class Student
    // Here, "this" will be replaced with "obj2" and... "OtherObject" will be replaced with "obj1"
    Student(Student otherObject){
        this.rno = otherObject.rno;
        this.name = otherObject.name;
        this.marks = otherObject.marks;
    }

    // The following is a way to call a constructor from another constructor
    Student(){
        this(10,"newMan",96.88f);
    }
}

/*
____________________________________________________________________________
----> Class is a named collection of properties and functions

____________________________________________________________________________
"new" keyword is basically allocating the memory dynamically(at runtime) and returns a reference to it
____________________________________________________________________________
---> The "this" keyword works as a reference variable when you are calling it via a reference variable...
---> Othersise it will work as class... Like in this example when you are calling another constructor from a constructor then you are not calling "this" via a reference variable.. So it will work as "Student" in this example
____________________________________________________________________________
---> Now there must be a question that why the primitive datatypes are not instantiated as objects... So the answer is that in Java the primitives are not objects... So they are not stored in the heap memory... Rather they are stored in the stack memory... 
*/