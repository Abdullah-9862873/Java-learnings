package pkg2_interface;

public class NiceCar{
    private Engine engine;
    private Media cdplayer = new CDPlayer();

    public NiceCar(){
        engine = new ElectricEngine();
    }

    public void upgradeCar(){
        engine = new PowerEngine();
    }

    public void startMusic(){
        cdplayer.start();
    }

    public void stopMusic(){
        cdplayer.stop();
    }

    public void engineStart(){
        engine.start();
    }

    public void engineStop(){
        engine.stop();
    }
}
