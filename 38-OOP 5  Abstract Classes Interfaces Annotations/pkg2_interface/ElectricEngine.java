package pkg2_interface;

public class ElectricEngine implements Engine{
    @Override
    public void start(){
        System.out.println("Electric Engine Start");
    }
    public void stop(){
        System.out.println("Electric Engine stop");
    }
    public void acc(){
        System.out.println("Electric Engine accelerated");
    }
}