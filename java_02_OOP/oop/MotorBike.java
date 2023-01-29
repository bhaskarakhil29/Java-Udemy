package java_02_OOP.oop;

public class MotorBike {
    
    //state
    private int speed;
    // behaviour
    public int getSpeed() {
        return speed;
    }

    public MotorBike(int speed) {
        if (speed > 0)
            this.speed = speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0)
            this.speed = speed;
    }
    
    void start() {
        System.out.println("Starting...");
    }

    public void increaseSpeed(int howMuch) {
        setSpeed(this.speed + howMuch);;
    }
    
    public void decreaseSpeed(int howMuch) {
        setSpeed(this.speed - howMuch);
    }
    
}
