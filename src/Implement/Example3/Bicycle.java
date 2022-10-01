package Implement.Example3;

public class Bicycle implements IVehicle {
    private int speed;
    private int gear;

    public Bicycle(int speed) {
        setSpeed(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void speedUp(int speed) {
        this.speed += speed;
    }

    @Override
    public void applyBrakes(int brakes) {
        this.speed -= brakes;
    }

    public void printAll() {
        System.out.println("current speed is " + this.getSpeed() + " gear count is " + this.getGear());
    }
}
