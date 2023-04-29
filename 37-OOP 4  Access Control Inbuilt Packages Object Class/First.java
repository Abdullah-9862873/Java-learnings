public class First{
    public static void main(String[] args) {
        A obj = new A(10, "Abdullah");
        System.out.println(obj.getNum());

    }
}

class A{
    private int num;
    String name;
    int[] arr;

    A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }
}

/*
_________________________________________________________________________________________________
The Java SE libraries include a wide range of classes and interfaces for tasks such as I/O, networking, database access, and GUI programming. Some of the key packages included in the Java SE libraries are:

1- java.lang: Provides classes that are fundamental to the design of the Java programming language, such as String, Object, and System.

2- java.util: Provides a collection of useful utility classes, such as ArrayList, HashMap, and StringTokenizer.

3- java.io: Provides classes for reading and writing data streams, files, and other I/O operations.

4- java.net: Provides classes for networking, including sockets, URL handling, and HTTP connections.

5- java.sql: Provides classes for accessing and manipulating databases using the SQL language.

6- java.awt: Provides classes for creating GUI components, such as buttons, text fields, and panels.

7- javax.swing: Provides a more advanced set of GUI components, such as dialogs, menus, and tables.

___________________________________________________________________________________________________
 */