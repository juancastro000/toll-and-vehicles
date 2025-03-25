package dev.juancastro.toll;

public class Truck implements Vehicle {
    private String plate;
    private int axles;

    public Truck(String plate, int axles) {
        this.plate = plate;
        this.axles = axles;
    }

    @Override
    public int calculateToll() {
        return 50 * axles;
    }

    @Override
    public String getPlate() {
        return plate;
    }
}
