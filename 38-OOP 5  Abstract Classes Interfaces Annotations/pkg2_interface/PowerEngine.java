package pkg2_interface;

public class PowerEngine implements Engine{
    @Override
    public void start(){
        System.out.println("Power Engine Start");
    }
    public void stop(){
        System.out.println("Power Engine stop");
    }
    public void acc(){
        System.out.println("Power Engine accelerated");
    }
}
