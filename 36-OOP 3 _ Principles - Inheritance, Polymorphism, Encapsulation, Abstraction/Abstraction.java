public class Abstraction {
    public static void main(String[] args) {
        Box obj = new Box(); // Create a new Box object using the default constructor
        double l = obj.getL(); // Call the getL() method to retrieve the value of the private variable l
        System.out.println(l); // Print the value of l to the console
    }
}

class Box{
    private double l; // Declare a private instance variable l
    private double w; // Declare a private instance variable w

    Box(){ // Default constructor
        this.l = -1; // Initialize l to -1
        this.w = -1; // Initialize w to -1
    }

    double getL(){ // Public method for accessing the private variable l
        return l;
    }
}

/*
---------------------------------------------------------------------------------
Abstraction vs. Encapsulation:

- Encapsulation is a technique for hiding the implementation details of an object and providing a clean and simple interface for using it.
- Abstraction is a higher-level concept that focuses on providing a simplified view of a system or object.

- Encapsulation is about controlling access to data, regardless of its access level.
- Abstraction is about representing complex systems or objects in a simplified way.

- Encapsulation helps to achieve data security and maintainability.
- Abstraction helps to achieve a better understanding of a system or object.

In this example, we use encapsulation to hide the implementation details of the Box object and provide a public method getL() to retrieve the value of its private variable l.
---------------------------------------------------------------------------------
*/
