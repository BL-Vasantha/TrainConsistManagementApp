package service;

public class SearchService {

    // 🔍 Search with Fail-Fast Validation
    public boolean searchBogieById(String[] bogieIds, String searchKey) {

        // ❗ Fail-Fast Check
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("❌ Cannot perform search: No bogies available in train");
        }

        // 🔎 Linear Search
        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                return true; // 🎯 Found
            }
        }

        return false; // ❌ Not Found
    }
}