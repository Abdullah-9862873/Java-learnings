package ExceptionHandling;
import javax.sound.midi.Soundbank;

public class exception {
    public static void main(String[] args) {
        // ____________________________________________________FROM
        // int a = 10;
        // int b = 0;

        // try{
        // int ans = a/b;
        // }catch(Exception e){
        // System.out.println(e.getMessage());
        // }finally{
        // System.out.println("This will always gets called no matter if try or catch
        // gets hit or not");
        // }
        // ____________________________________________________TO
        // ____________________________________________________FROM
        // int a = 10;
        // int b = 0;

        // try{
        // divide(a,b);
        // }catch(ArithmeticException e){
        // System.out.println(e.getMessage());
        // }
        // ____________________________________________________TO
        // ____________________________________________________FROM
        // int a = 10;
        // int b = 0;

        // try {
        //     divide(a, b);
        // } catch (ArithmeticException e) {
        //     System.out.println("Arithematic Exception");
        // }catch (Exception e) {
        //     System.out.println("normal exception");
        // }
        // ____________________________________________________TO
        
        // ____________________________________________________FROM
        

        try {
            String name = "Abdullah";
            if(name.equals("Abdullah")){
                throw new MyException("This is my Exception");
            }
        }catch(MyException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e) {
            System.out.println("Arithematic Exception");
        }catch (Exception e) {
            System.out.println("normal exception");
        }
        // ____________________________________________________TO
        
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Please do not divide by Zero");
        }
        return a / b;
    }
}

/*
 _______________________________________________________________________
----> In Java, errors and exceptions are both types of "throwable" objects
that represent problems that occur during program execution. However, there
are some key differences between them.

----> Errors are generally more serious and catastrophic than exceptions.
Errors are typically caused by problems that are outside of the control of
the application, such as running out of memory, hardware failures, or
operating system crashes. When an error occurs, it is generally not possible
for the application to recover or continue running, so errors are typically
fatal and terminate the application.

----> Exceptions, on the other hand, are caused by problems that occur within
the application's code, such as dividing by zero, attempting to access an
invalid index of an array, or trying to open a file that does not exist.
Exceptions can be caught and handled by the application's code, allowing the
program to recover from the problem and continue running. Exceptions can be
divided into two types: checked exceptions and unchecked exceptions.

----> Checked exceptions are exceptions that the Java compiler requires to be
caught or declared in the method signature using the "throws" keyword.
Examples of checked exceptions include IOException, ClassNotFoundException,
and SQLException.

----> Unchecked exceptions are exceptions that do not need to be caught or
declared. Examples of unchecked exceptions include NullPointerException,
ArrayIndexOutOfBoundsException, and ArithmeticException.

_______________________________________________________________________
----> As the "ArithematicException" is a class that extends
"RuntimeException" which further is extended from "Exception" so you can also
do something like

try{
divide(a,b);
}catch(Exception e){
System.out.println(e.getMessage());
}
----> This will give the same output
_______________________________________________________________________
----> "throws" is used in the method signature to declare that a method may
throw a particular type of exception. When a method throws a checked
exception, it is required to declare it using the "throws" keyword in the
method signature. This allows the calling code to handle the exception or
propagate it up the call stack to another method that can handle it.

----> On the other hand, "throw" is used to explicitly throw an exception
from the code. This can be used to create and throw custom exceptions, or to
throw built-in exceptions when an error condition is encountered.
_______________________________________________________________________
----> We can use more than one catch in the single like TryCatch block....
For Example

try {
            divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println("Arithematic Exception");
        }catch (Exception e) {
            System.out.println("normal exception");
        }

----> But here you cannot do like the following

try {
            divide(a, b);
        } catch (Exception e) {
            System.out.println("Normal Exception");
        }catch (ArithmaticException e) {
            System.out.println("Arithmatic exception");
        }

This is because, the Exception class covers all the exceptions like the arithematic and other exceptions... So in order to specify your custom exception messages the subclasses needs to be specified first
_______________________________________________________________________
 */
