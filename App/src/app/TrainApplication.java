package app;


import exception.InvalidCapacityException;
import model.PassengerBogie;

import java.util.ArrayList;
import java.util.List;

public class TrainApplication {

    public static void main(String[] args) {

        List<PassengerBogie> bogies = new ArrayList<>();

        try {

            // ✅ Valid bogies
            bogies.add(new PassengerBogie("Sleeper", 72));
            bogies.add(new PassengerBogie("AC Chair", 50));

            // ❌ Invalid bogie (will throw exception)
            bogies.add(new PassengerBogie("First Class", 0));

        } catch (InvalidCapacityException e) {

            System.out.println("\nError while creating bogie:");
            System.out.println(e.getMessage());
        }

        // ✅ Continue execution safely
        System.out.println("\nValid bogies in train:\n");

        for (PassengerBogie b : bogies) {
            System.out.println(b.getType() + " - " + b.getCapacity());
        }
    }
}