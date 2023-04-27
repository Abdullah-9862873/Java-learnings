public class Class1_Packages_StaticKeyword {
    public static void main(String[] args) {
        // Human one = new Human(21, "Abdullah", 10000);
        // Human two = new Human(34, "Ahmed", 12000);

        // System.out.println(Human.population);
        // System.out.println(Human.population);

        fun();
    }

    //__________________________________________________________FROM
    // static void fun(){
    //     greeting();     // You cannot use it bcz it required instance
    // }

    // Something which is not static belongs to an object
    // void greeting(){
    //     System.out.println("Hello");
    // }

    //__________________________________________________________TO
    //__________________________________________________________FROM
    static void fun(){
        Class1_Packages_StaticKeyword obj = new Class1_Packages_StaticKeyword();
        obj.greeting();
    }
    
    void greeting(){
        System.out.println("Hello");
    }
}

class Human{
    int age;
    String name;
    int salary;
    static long population;

    Human(int age, String name, int salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.population += 1;
    }
}


/*
____________________________Package_______________________________________________
----> Packages are basically the folders to store the classes of java
----> By convention you name the packages somewhat like, for example you are working for a company name laptop.com... Then you should create a package named "com" and inside that package you should creae a new package named "laptop" and inside laptop package you can create some new packages basically folders...


----> Now if you have a package named "com" and there is only one package inside it named "laptop" and inside of it you have two packages "a" and "b" and inside lets say "a" you have a class "Greeting.java"... Then that Greeting class should specify where it is present so it has to specify at the top, the hierarchy of the package lists so for example in this case, "package com.laptop.a"

-----> Also if you have some class like "Greeting.java" inside "a" and same filename inside "b" then if You have a "Main.java" inside a then and if you call Greeting() inside that Main class.. Then it will first check its own directory for the class and here in this case it will find it so there is no need to import the method "greeting()" from the class "Greeting.java"... Its present in the same directory so it knows...

-----> But if its not present in the same directory then it has to import it 
first and then use it
______________________________Static____________________________________________
----> Let's say I have the following class
class Human{
    int age;
    String name;
    int salary;

    Human(int age, String name, int salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
}

----> Let's say that there is a characteristic or a property of this class that is not actually related to that object... So for example, let this class has a property called "population"... Does it actually related to the obj... That Obj1 has population of human 7Billion and obj2 has population of human 5Billion... The answer is No... Population will be same for both objects so in this case we create a property using the static keyword... And if you have used static keyword to create an instance variable let's say population then you don't have to use "this" keyword, as it is not specified to that object only... So we use the class name...

----> For example

class Human{
    int age;
    String name;
    int salary;
    static long population;

    Human(int age, String name, int salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.population += 1;
    }
}

----> The above class will initialise the population as zero as this is the default value of the long and will keep on adding 1 as new objects are being created so if you do like the following then you will get an answer 2 for both objects...

Human one = new Human(21, "Abdullah", 10000);
        Human two = new Human(34, "Ahmed", 12000);

        System.out.println(one.population);
        System.out.println(two.population);

----> So basically static variable is common to every object of that class
----> Static instance variables are not dependent on any object declation of initialisation... And if you don't make any object of that class then still you can access the static instance variable...


----> Question: Why do we make "public static void main(String[] args)", why do we use static in it?

----> Answer: So basically the "psvm" is present inside a class "Main" and static is basically used where we want to use method or function of the class, without creating an object of that class... In java, you cannot run anything if you dont have "main()" so if the main if the first thing you have to run and you can't make object of class "Main" and run them first... This is why we have to make our "main(String[] args)" as static

#### IMPORTANT ####
-----> Inside a static method, you cannot use anything that is not static...
-----> This is the reason that whatever functions we create in java, we make them static... like the following outisde the main()

static void greeting(){
    System.out.println("Hello");
}

----> Something which is not static belongs to an object... So the greeting method in this example, needs to have an object but the main() does not need to have an object... This is why you cannot call a non static method from a static method...

----> If you have a main() method which is not dependent on any instance then how will it contain something that is dependent on any instance... 
----> You can use a static method inside something that is non static, that is fine


__________________________________________________________________________________
----> How to use like what if I want to use a non static method inside a static one... So in this case you have to create an object of the static method and then use it inside like the following

public class Class1_Packages_StaticKeyword {
    public static void main(String[] args) {
        fun();
    }

    static void fun(){
        Class1_Packages_StaticKeyword obj = new Class1_Packages_StaticKeyword();
        obj.greeting();
    }
    
    void greeting(){
        System.out.println("Hello");
    }
}

Conclusion----> You cannot access a non static stuff without referencing their instance in a static context

_________________________________________________________________________________

 */
