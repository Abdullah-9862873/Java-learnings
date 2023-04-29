package abstraction;
public class Son extends Parent{
    int age;

    public Son(int age){
        super(age);
        this.age = age;
    }

    @Override
    void career(){
        System.out.println("I want to be a Doctor");
    }

    @Override
    void partener(){
        System.out.println("I love Pepper Potts");
    }
}
