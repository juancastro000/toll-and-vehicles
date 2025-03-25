package dev.juancastro.toll;

public class Motorbike implements Vehicle {
    private String plate;

    public Motorbike(String plate) {
        this.plate = plate;
    }

    @Override
    public int calculateToll() {
        return 50;
    }

    @Override
    public String getPlate() {
        return plate;
    }
}