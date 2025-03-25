package dev.juancastro.toll;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class TollStationTest {
    
    @Test
    void createTollStation() {
        TollStation station = new TollStation("S1", "Medellín");
        
        assertThat(station.getName(), is("S1"));
        assertThat(station.getCity(), is("Medellín"));
        assertThat(station.getTotalCollected(), is(0));
    }

    @Test
    void processCar_shouldAdd100ToTotal() {
        TollStation station = new TollStation("S1", "Medellín");
        Vehicle car = new Car("ABC123");
    
        station.processVehicle(car);
    
        assertThat(station.getTotalCollected(), is(100));
    }
    @Test
    void processMoto_shouldAdd50ToTotal() {
        TollStation station = new TollStation("S1", "Medellín");
        Vehicle moto = new Motorbike("XYZ789");
    
        station.processVehicle(moto);
    
        assertThat(station.getTotalCollected(), is(50));
    }
    @Test
    void processTruckWith3Axles_shouldAdd150ToTotal() {
        TollStation station = new TollStation("S1", "Medellín");
        Vehicle truck = new Truck("TRK456", 3);
    
        station.processVehicle(truck);
    
        assertThat(station.getTotalCollected(), is(150));
    }
    @Test
    void getProcessedVehicles_shouldReturnAllVehicles() {
        TollStation station = new TollStation("S1", "Medellín");
        Vehicle car = new Car("ABC123");
        Vehicle truck = new Truck("TRK456", 2);
    
        station.processVehicle(car);
        station.processVehicle(truck);
    
        assertThat(station.getProcessedVehicles(), containsInAnyOrder(car, truck));
    }
    @Test
    void generateReport_shouldReturnFormattedStrings() {
        TollStation station = new TollStation("S1", "Medellín");
        station.processVehicle(new Car("ABC123"));
        station.processVehicle(new Truck("TRK456", 2));
    
        List<String> report = station.generateReport();
    
        assertThat(report, contains(
            "Vehículos procesados:",
            "ABC123 - $100",
            "TRK456 - $100",
            "Total recolectado: $200"
    ));
    }
}