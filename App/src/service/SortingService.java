package service;

import java.util.Arrays;

public class SortingService {

    public String[] sortBogieNames(String[] bogieNames) {

        // ✅ Using built-in optimized sorting
        Arrays.sort(bogieNames);

        return bogieNames;
    }
}