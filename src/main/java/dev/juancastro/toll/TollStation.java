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
    public List<Vehicle> getProcessedVehicles() {
        return processedVehicles;
    }
    public List<String> generateReport() {
        List<String> report = new ArrayList<>();
        report.add("Vehículos procesados:");
        
        for (Vehicle vehicle : processedVehicles) {
            String line = String.format(
                "%s - $%d", 
                vehicle.getPlate(), 
                vehicle.calculateToll()
            );
            report.add(line);
        }
        
        report.add("Total recolectado: $" + totalCollected);
        return report;
    }

}
