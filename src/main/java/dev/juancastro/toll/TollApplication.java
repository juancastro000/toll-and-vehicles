package dev.juancastro.toll;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TollApplication {

	public static void main(String[] args) {
        TollStation station = new TollStation("PEAJE VIVA", "Medellín");
        
        station.processVehicle(new Car("ABC123"));
        station.processVehicle(new Motorbike("XYZ789"));
        station.processVehicle(new Truck("TRK456", 3));
        station.processVehicle(new Car("DEF456"));
        station.processVehicle(new Truck("CAM123", 5));

        System.out.println("=== REPORTE DE PEAJE ===");
        System.out.println("Estación: " + station.getName());
        System.out.println("Ubicación: " + station.getCity());
        System.out.println("-----------------------");
        
        for (String line : station.generateReport()) {
            System.out.println(line);
        }
    }

}
