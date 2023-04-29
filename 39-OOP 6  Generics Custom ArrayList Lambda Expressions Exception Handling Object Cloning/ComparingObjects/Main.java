package ComparingObjects;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) {
        // Student std1 = new Student(23, 12);
        // Student std2 = new Student(34, 11);

        // if((std1.compareTo(std2)) > 0){
        //     System.out.println("std1 has more marks");
        // }else if((std1.compareTo(std2)) < 0){
        //     System.out.println("std2 has more marks");
        // }else{
        //     System.out.println("Both have equal marks");
        // }

        Student std1 = new Student(23, 1);
        Student std2 = new Student(35, 4);
        Student std3 = new Student(21, 16);
        Student std4 = new Student(46, 19);
        Student std5 = new Student(249, 7);

        // Student[] list = {std1,std2,std3,std4,std5};
        // System.out.println(Arrays.toString(list));
        // Arrays.sort(list);
        // System.out.println(Arrays.toString(list));

    //     Student[] list = {std1,std2,std3,std4,std5};
    //     System.out.println(Arrays.toString(list));
    //     Arrays.sort(list, new Comparator<Student>(){
    //         @Override
    //         public int compare(Student obj1, Student obj2){
    //             return (int)(obj1.marks - obj2.marks);
    //         }
    //     });
    //     System.out.println(Arrays.toString(list));
    // }
}

/*
______________________________________________________________________________
----> Tis code will not generate the list so I have to make a custom toString method in the Student class
______________________________________________________________________________
----> By doing the following in the code, will make the code to sort according to the marks...
        Student[] list = {std1,std2,std3,std4,std5};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

----> If we remove the compareTo method then this will not work... So we have to specify the compareTo method to ensure that what is it using to compare the values and based on what, it is gonna sort them... So in this case if it is specified as "marks" in the Student class then it will sort them according to the marks... Like the following
    @Override
    public int compareTo(Student obj){
        int difference = (int)(this.marks - obj.marks);
        return difference;
    }

    @Override
    public String toString(){
        return marks + "";
    }
______________________________________________________________________________
----> You can also use Comparator inside the Arrays.sort that will allow you to sort as you want...

        Student[] list = {std1,std2,std3,std4,std5};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Student>(){
            @Override
            public int compare(Student obj1, Student obj2){
                return (int)(obj1.marks - obj2.marks);
            }
        });
        System.out.println(Arrays.toString(list));
    }
---> Simply to sort it in descending order just add - in it like
return -(int)(obj1.marks - obj2.marks);

______________________________________________________________________________
*/

