package java_OOP_02.oop;

public class MotorBike {
    
    //state
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed >0)
            this.speed = speed;
    }

    // behaviour
    void start() {
        System.out.println("Starting...");
    }
    
}
