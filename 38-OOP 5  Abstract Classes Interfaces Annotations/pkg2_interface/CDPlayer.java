package pkg2_interface;

public class CDPlayer implements Media{
    @Override
    public void start(){
        System.out.println("Media Player Start");
    }

    @Override
    public void stop(){
        System.out.println("Media Player Stop");
    }
}