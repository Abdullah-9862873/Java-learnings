package pkg;

public class SingletonClass {
    private int age;
    private String name;

    private SingletonClass(){}

    static SingletonClass instance;
    public static SingletonClass getInstance(){
        if(instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

}

/*
____________________________________________________________________________
----> Singleton class is basically a class whose only one instance can be created...
----> You can think of it like, as the instances are created using the constructor so we will restrict the constructor to run for once...
----> By making the constructor private I can only access it inside the class
----> We will declare an instance of it and initialise it only once when the user puts request to create an object
----> Here getInstance() is a method of type, Singleton which means that it can only return instance... so we check if any instance is already created or not... If its not then creating and returning, otherwise just returning that instance...
____________________________________________________________________________
 */
