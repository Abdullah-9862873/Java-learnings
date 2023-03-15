import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 3));

        System.out.println("a" + 1);
        // This will be after some steps "a" + "1"
        // The integer will call the wrapper class Integer which will call the toString
        // and which will convert the number to the string

        System.out.println("Abdullah" + new Integer(56));
        System.out.println("Abdullah" + new ArrayList<>());

        System.out.println(new Integer(10) + "" + new ArrayList<>());

    }
}

/*
 * The "+" operator can only be used in two places
 * ------------------> In between the primitives
 * ------------------> You can use this + with all the complex objects as well
 * but the only condition is that one of the value of these objects must be of
 * type string
 * 
 * The following will not work
 * System.out.println(new Integer(10) + new ArrayList<>());
 * 
 * But if you add a string inside it then it will work
 * System.out.println(new Integer(10) + "" + new ArrayList<>());
 * 
 * _________________________________________________________________________
 * The + operator is used to add the values... But in case of java it has one
 * more exception that it can also be used to concatenate the strings like the
 * following
 * 
 * "a" + "b" -----> Result would be "ab"
 * 
 * In C++ and Python you have the option to make the operators work like you
 * want them to so you can add any type of object with any other based on the
 * exceptional cases that you make in the inside but in the java it is not
 * allowed... It is giving us only one exception that is to concatenate the
 * strings
 * 
 * _________________________________________________________________________
 */