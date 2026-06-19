import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * ==========================================
 * MAIN CLASS - UseCase7TrainConsistMgmt
 * ==========================================
 *
 * Use Case 7: Sort Bogies by Capacity
 *
 * Description:
 * This class sorts passenger bogies based on
 * seating capacity using a custom Comparator.
 *
 * At this stage, the application:
 * - Creates bogie objects
 * - Stores them in a List
 * - Displays unsorted data
 * - Sorts using Comparator logic
 * - Displays sorted result
 *
 * This maps custom ordering using Comparator.
 *
 * @author Vasantha
 * @version 7.0
 */

public class TrainConsistMgmt {

    // Inner Bogie class
    static class Bogie {

        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("========================================\n");

        // Create List of passenger bogies
        List<Bogie> bogies = new ArrayList<>();


        // Add bogie objects
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));


        // Before sorting
        System.out.println("Before Sorting:");

        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }


        // Sort by capacity
        bogies.sort(
                Comparator.comparingInt(
                        bogie -> bogie.capacity
                )
        );


        // After sorting
        System.out.println("\nAfter Sorting by Capacity:");

        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }

        System.out.println(
                "\nUC7 sorting completed..."
        );
    }
}