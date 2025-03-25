package dev.juancastro.toll;

import java.util.ArrayList;
import java.util.List;

public class TollStation {
    private String name;
    private String city;
    private int totalCollected;
    private List<Vehicle> processedVehicles = new ArrayList<>();

    public TollStation(String name, String city) {
        this.name = name;
        this.city = city;
        this.totalCollected = 0;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getTotalCollected() {
        return totalCollected;
    }
    public void processVehicle(Vehicle vehicle) {
        totalCollected += vehicle.calculateToll();
        processedVehicles.add(vehicle);
    }

}
