package app;


import service.SearchService;

public class TrainApplication {

    public static void main(String[] args) {

        // 🔹 Unsorted Bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG150", "BG999", "BG321"};

        String searchKey = "BG150"; // 🔍 ID to search

        SearchService service = new SearchService();

        System.out.println("Searching for Bogie ID: " + searchKey);

        boolean found = service.searchBogieById(bogieIds, searchKey);

        if (found) {
            System.out.println("✅ Bogie Found in Train Consist");
        } else {
            System.out.println("❌ Bogie Not Found");
        }
    }
}