package abstraction;
public class Daughter extends Parent {
    int age;

    Daughter(int age){
        super(age);
        this.age = age;
    }

    @Override
    void career(){
        System.out.println("I want to be a Coder");
    }

    @Override
    void partener(){
        System.out.println("I love Iron Man");
    }
    
}
