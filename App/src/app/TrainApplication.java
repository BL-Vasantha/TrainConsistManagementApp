package app;

import service.SortingService;

import java.util.Arrays;

public class TrainApplication {

    public static void main(String[] args) {

        // 🔹 Input bogie names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Second Sitting"};

        SortingService service = new SortingService();

        System.out.println("Bogie Names (Before Sorting):");
        System.out.println(Arrays.toString(bogieNames));

        // 🔄 Sorting using Arrays.sort()
        String[] sorted = service.sortBogieNames(bogieNames);

        System.out.println("\nBogie Names (After Sorting):");
        System.out.println(Arrays.toString(sorted));
    }
}