package app;

import service.SearchService;

import java.util.Arrays;

public class TrainApplication {

    public static void main(String[] args) {

        // 🔹 Sorted Bogie IDs (MANDATORY for Binary Search)
        String[] bogieIds = {"BG101", "BG150", "BG205", "BG321", "BG999"};

        String searchKey = "BG205"; // 🔍 ID to search

        SearchService service = new SearchService();

        System.out.println("Bogie IDs: " + Arrays.toString(bogieIds));
        System.out.println("Searching for Bogie ID: " + searchKey);

        boolean found = service.binarySearchBogieId(bogieIds, searchKey);

        if (found) {
            System.out.println("✅ Bogie Found using Binary Search");
        } else {
            System.out.println("❌ Bogie Not Found");
        }
    }
}