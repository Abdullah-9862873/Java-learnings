package pkg2_interface;

public class Main {
    public static void main(String[] args) {
        // Car car = new Car();
        // car.acc();
        // car.start();
        // car.brake();
        // car.stop();

        // Media carMedia = new Car();
        // carMedia.start();

        //______________________________________
        NiceCar car = new NiceCar();
        car.engineStart();
        car.engineStop();
        car.startMusic();
        car.stopMusic();
    }
}
