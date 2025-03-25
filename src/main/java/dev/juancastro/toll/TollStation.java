package dev.juancastro.toll;

public class TollStation {
    String name;
    String city;
    int totalCollected;

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

}
