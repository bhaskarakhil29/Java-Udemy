package java_02_OOP.oop;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike hunter = new MotorBike(100);
        MotorBike ducati = new MotorBike(140);
        
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
