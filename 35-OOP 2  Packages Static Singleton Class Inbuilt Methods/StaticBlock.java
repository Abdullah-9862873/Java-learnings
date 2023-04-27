public class StaticBlock {
    static int a = 4;
    static int b;

    // This will run only once, when the StaticBlock class is being loaded
    static {
        System.out.println("Hello I am static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}

/*
______________________________________________________________________________
-----> The static block runs only once, so for example if I create an object of StaticBlock class and then try to print it again then it will not call the static{} again... 
 */
