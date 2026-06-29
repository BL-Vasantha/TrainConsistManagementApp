package app;


import service.SortingService;

public class TrainApplication {

    public static void main(String[] args) {

        // 🔹 Input array (Passenger bogie capacities)
        int[] capacities = {72, 50, 90, 40, 60};

        SortingService service = new SortingService();

        System.out.println("Passenger Bogie Capacities (Before Sorting):");

        for (int cap : capacities) {
            System.out.print(cap + " ");
        }

        // 🔄 Perform Bubble Sort
        service.bubbleSort(capacities);

        System.out.println("\n\nPassenger Bogie Capacities (After Sorting):");

        for (int cap : capacities) {
            System.out.print(cap + " ");
        }
    }
}