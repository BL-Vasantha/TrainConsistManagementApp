package controller;

import model.GoodsBogie;
import service.SafetyService;

import java.util.List;

public class SafetyController {

    private final SafetyService service;

    public SafetyController() {
        this.service = new SafetyService();
    }

    public void checkSafety(List<GoodsBogie> bogies) {

        boolean isSafe = service.checkSafety(bogies);

        System.out.println("\n--- Safety Compliance Result ---");

        if (isSafe) {
            System.out.println("Train is SAFE for operation ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
            System.out.println("Rule Violated: Cylindrical bogie must carry Petroleum only");
        }
    }
}