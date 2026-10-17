package lk.iit.oop.week04;

public class Plane extends Vehicle{
    private int wingSpan;
    private int minRunway;

    public Plane(String vehicleID, String make, String model, int topSpeed, int capacity, int minRunway, int wingSpan) {
        super(vehicleID, make, model, topSpeed, capacity);
        this.minRunway = minRunway;
        this.wingSpan = wingSpan;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public int getMinRunway() {
        return minRunway;
    }

    public void setMinRunway(int minRunway) {
        this.minRunway = minRunway;
    }
}
