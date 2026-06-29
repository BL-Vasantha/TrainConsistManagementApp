package service;

public class SearchService {

    // 🔍 Linear Search Method
    public boolean searchBogieById(String[] bogieIds, String searchKey) {

        for (int i = 0; i < bogieIds.length; i++) {

            // ✅ Using equals() for String comparison
            if (bogieIds[i].equals(searchKey)) {
                return true; // 🎯 Found
            }
        }

        return false; // ❌ Not Found
    }
}