package app;

import model.GoodsBogie;
import service.PerformanceService;


import java.util.ArrayList;
import java.util.List;

public class TrainApplication {

    public static void main(String[] args) {

        List<GoodsBogie> bogies = new ArrayList<>();

        // Creating large dataset for better comparison
        for (int i = 0; i < 10000; i++) {
            bogies.add(new GoodsBogie("cylindrical", "petroleum"));
            bogies.add(new GoodsBogie("open", "coal"));
            bogies.add(new GoodsBogie("box", "grain"));
        }

        PerformanceService service = new PerformanceService();

        System.out.println("=== Performance Comparison ===\n");

        // Loop
        service.filterUsingLoop(bogies);

        // Stream
        service.filterUsingStream(bogies);
    }
}