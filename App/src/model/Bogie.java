package model;

public class Bogie {

    private String name;
    private int displayCount;   // what user sees
    private int actualSeats;    // used for total calculation

    public Bogie(String name, int displayCount, int actualSeats) {
        this.name = name;
        this.displayCount = displayCount;
        this.actualSeats = actualSeats;
    }

    public String getName() {
        return name;
    }

    public int getDisplayCount() {
        return displayCount;
    }

    public int getActualSeats() {
        return actualSeats;
    }
}