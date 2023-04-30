public class Enums {
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        // These are enum constants
        // They are public, static and final by default
        // Type of these is "Week"
        // Since they are final so you cannot create child elements
        // Abstracts are not allowed in enum so every method in the enum need to have a body

        //Constructor you cannot make reason is below in the notes
        // Week(){
        //     System.out.println("Constructor called for: " + this);
        // }
    }

    public static void main(String[] args) {
        Week week;

        week = Week.Monday;

        // for(Week day: Week.values()){
        //     System.out.println(day);
        // }

        // System.out.println(week);
        // System.out.println(week.ordinal());

        // It returns the enum constant that is "Monday"
        System.out.println(Week.valueOf("Monday"));


    }
}

/*
________________________________________________________________________________
ordinal() means the position of the enum declaration... so here the declaration in Monday which is at position 0
________________________________________________________________________________
----> We use enums when there is fixed number of objects 
________________________________________________________________________________
----> Enum can implement as many interfaces as it wants, but it cannot extend any class
________________________________________________________________________________
----> New objects cannot be created with enums in Java. Enum constants are predefined and fixed at the time of compilation, and they cannot be modified or added to at runtime. This means that you cannot create new instances of an enum using a constructor, as you would with a regular class.
 */
