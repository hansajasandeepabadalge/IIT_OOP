package lk.iit.oop.week04;

public class Car extends Vehicle{ // Every class in Java automatically inherits from the Object class, either directly or indirectly, even if 'extends Object' is not explicitly declared.
    private int doors;
    private String transmission;

    public Car(String vehicleID, String make, String model, int topSpeed, int capacity, int doors, String transmission) {
        super(vehicleID, make, model, topSpeed, capacity);
        this.doors = doors;
        this.transmission = transmission;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}
