package service;

import model.GoodsBogie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PerformanceService {

    // Loop-based filtering
    public List<GoodsBogie> filterUsingLoop(List<GoodsBogie> bogies) {

        long start = System.nanoTime();

        List<GoodsBogie> result = new ArrayList<>();

        for (GoodsBogie b : bogies) {
            if (b.getType().equalsIgnoreCase("cylindrical")) {
                result.add(b);
            }
        }

        long end = System.nanoTime();

        System.out.println("Loop Execution Time: " + (end - start) + " ns");

        return result;
    }

    // Stream-based filtering
    public List<GoodsBogie> filterUsingStream(List<GoodsBogie> bogies) {

        long start = System.nanoTime();

        List<GoodsBogie> result = bogies.stream()
                .filter(b -> b.getType().equalsIgnoreCase("cylindrical"))
                .collect(Collectors.toList());

        long end = System.nanoTime();

        System.out.println("Stream Execution Time: " + (end - start) + " ns");

        return result;
    }
}