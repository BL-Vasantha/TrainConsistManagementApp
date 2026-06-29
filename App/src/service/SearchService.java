package service;

public class SearchService {

    // 🔍 Binary Search Method (Array must be sorted)
    public boolean binarySearchBogieId(String[] bogieIds, String searchKey) {

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = bogieIds[mid].compareTo(searchKey);

            if (comparison == 0) {
                return true; // 🎯 Found
            } else if (comparison < 0) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }


        return false; // ❌ Not Found
    }
}