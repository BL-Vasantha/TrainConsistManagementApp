package app;

import service.SearchService;

public class TrainApplication {

    public static void main(String[] args) {

        // 🔹 Case 1: Empty Bogie List (to trigger exception)
        String[] bogieIds = {};

        String searchKey = "BG101";

        SearchService service = new SearchService();

        try {
            System.out.println("Searching for Bogie ID: " + searchKey);

            boolean found = service.searchBogieById(bogieIds, searchKey);

            if (found) {
                System.out.println("✅ Bogie Found");
            } else {
                System.out.println("❌ Bogie Not Found");
            }

        } catch (IllegalStateException ex) {
            // ✅ Meaningful error handling
            System.out.println(ex.getMessage());
        }
    }
}