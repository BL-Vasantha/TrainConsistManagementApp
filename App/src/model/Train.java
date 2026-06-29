package model;

import java.util.HashMap;
import java.util.Map;

public class Train {

    private final Map<String, Integer> bogieCapacityMap = new HashMap<>();

    public Map<String, Integer> getBogieCapacityMap() {
        return bogieCapacityMap;
    }
}