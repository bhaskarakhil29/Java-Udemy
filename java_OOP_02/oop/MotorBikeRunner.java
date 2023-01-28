package java_OOP_02.oop;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike hunter = new MotorBike();
        MotorBike ducati = new MotorBike();
        
        hunter.start();
        hunter.setSpeed(100);
        ducati.start();
        System.out.println(hunter.getSpeed());
    }
}
