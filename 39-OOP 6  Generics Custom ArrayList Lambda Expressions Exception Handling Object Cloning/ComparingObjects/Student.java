package ComparingObjects;


public class Student implements Comparable<Student> {
    float marks;
    int rollno;

    Student(int marks, int rollno){
        this.marks = marks;
        this.rollno = rollno;
    }

    @Override
    public int compareTo(Student obj){
        int difference = (int)(this.marks - obj.marks);
        return difference;
    }

    @Override
    public String toString(){
        return marks + "";
    }
}
/*
_____________________________________________________________________________
----> So here, a "Comparable" is used... A Comparable is nothing but an interface and that interface is accepting a Generic... So the idea is that "What is the type of the object with which you are comparing?" So here I have specified that I am gonna compare Student with Student
----> One more thing is comparable has a class compareTo that needs to be overriden... So here the compareTo method will return a positive, 0, or a negative value based on the marks of both objects of type Student.

_____________________________________________________________________________
 */
