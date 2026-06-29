package model;

import exception.InvalidCapacityException;

public class PassengerBogie {

    private String type;
    private int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {

        // ✅ Fail-Fast Validation
        if (capacity <= 0) {
            throw new InvalidCapacityException(
                    "Invalid capacity for " + type + " bogie. Capacity must be greater than 0"
            );
        }

        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
}