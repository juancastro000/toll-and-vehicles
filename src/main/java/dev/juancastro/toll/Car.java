package dev.juancastro.toll;

public class Car implements Vehicle{
    private String plate;

    public Car(String plate) {
        this.plate = plate;
    }

    @Override
    public int calculateToll() {
        return 100;
    }

    @Override
    public String getPlate() {
        return plate;
    }
}
