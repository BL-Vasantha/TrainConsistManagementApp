package service;

public class SortingService {

    public void bubbleSort(int[] capacities) {

        int n = capacities.length;

        // 🔁 Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            // 🔁 Inner loop for comparison
            for (int j = 0; j < n - i - 1; j++) {

                // 🔍 Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // 🔄 Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }
}