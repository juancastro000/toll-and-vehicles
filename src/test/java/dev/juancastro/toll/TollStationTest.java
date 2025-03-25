package dev.juancastro.toll;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

public class TollStationTest {
    
    @Test
    void createTollStation() {
        TollStation station = new TollStation("S1", "Medellín");
        
        assertThat(station.getName(), is("S1"));
        assertThat(station.getCity(), is("Medellín"));
        assertThat(station.getTotalCollected(), is(0));
    }
}