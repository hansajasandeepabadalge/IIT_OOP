package lk.iit.oop.week04;

public class Boat extends Vehicle{
    private int doors;
    private String transmission;

    public Boat(String vehicleID, String make, String model, int topSpeed, int capacity, int doors, String transmission) {
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
