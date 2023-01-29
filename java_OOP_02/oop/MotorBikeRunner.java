package java_OOP_02.oop;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike hunter = new MotorBike();
        MotorBike ducati = new MotorBike();
        
        hunter.start();
        //hunter.setSpeed(-100);//Setting -100 as speed is invalid. Hence, encapsulation allows us to make validations in the setter method of the class.
        hunter.setSpeed(100);
        hunter.increaseSpeed(50);
        System.out.println(hunter.getSpeed());
        ducati.start();
        ducati.setSpeed(120);
        ducati.increaseSpeed(60);
        System.out.println(ducati.getSpeed());
    }
}
