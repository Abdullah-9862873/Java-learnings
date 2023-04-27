package pkg;

public class Main{
    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.getInstance();
        obj.setAge(21);;
        obj.setName("Abdullah");

        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}

/*
To run it just go to the directory above the package and compile the Main.java using the following command
----> javac pkg/Main.java

After that run it using 
----> java pkg.Main
 */