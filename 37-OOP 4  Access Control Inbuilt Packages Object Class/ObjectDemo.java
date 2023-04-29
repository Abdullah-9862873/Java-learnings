public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num, float gpa){
        this.num = num;
        this.gpa = gpa;
    }


    @Override
    public String toString(){
        return super.toString();
    }

    // @Override
    // protected void finalize() throws Throwable{
    //     super.finalize();
    // }

    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        // return super.equals(obj);
        return this.num == ((ObjectDemo) obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        // ObjectDemo obj = new ObjectDemo(23);
        // System.out.println(obj.hashCode());

        // String str1 = "Abdullah";
        // String str2 = "Abdullah";
        // System.out.println(str1.equals(str2));

        ObjectDemo obj = new ObjectDemo(23, 34.8f);
        ObjectDemo obj2 = new ObjectDemo(23, 67.7f);
        if(obj.equals(obj2)){
            System.out.println("Obj1 and Obj2 are equal");
        }
    }
}

/*
______________________________________________________________________________________
1- toString is used basically to convert anything to string
______________________________________________________________________________________
2- finalize keyword gets triggered when java hits garbage collection
______________________________________________________________________________________
3- hashcode gives us number which is basically a unique representation of an object... It is not the address, In java you cannot get the address
______________________________________________________________________________________
4- In Java, the equals() method is used to compare two objects for equality. By default, the equals() method compares the memory addresses of two objects to determine if they are the same object or not. However, most of the time, we want to compare objects based on their state or content rather than their memory addresses.

To do this, we need to override the equals() method in our custom class and provide our own implementation that compares the state or content of the objects...

In this example, we have modified the equals to compare only the "num" of two objects rather than the gpa...
______________________________________________________________________________________
NOTE---> To check if the object is the instance of a parent class... We just use "instanceOf" method like the following

sout(child instanceOf parent)

This will print true

______________________________________________________________________________________
NOTE---> If you want to get some data about the classes then you can use "getClass()" method as

sout(obj.getClass())

You can further put a dot ahead of the getClass() to access other methods like getConstructors() as well...
______________________________________________________________________________________
 */
