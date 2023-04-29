package abstraction;
public class Main {
    public static void main(String[] args) {
        Son son = new Son(23);
        son.career();
        son.normal();

        Daughter daughter = new Daughter(22);
        daughter.career();

        Parent obj = new Parent(45){
            @Override
            void career(){

            }

            @Override
            void partener(){
                
            }
        };

        System.out.println(obj.age);

        Parent.hello();


    }
}
