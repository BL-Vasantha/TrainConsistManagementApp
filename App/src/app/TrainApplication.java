package app;

import model.GoodsBogie;
import service.SafetyService;

import java.util.ArrayList;
import java.util.List;

public class TrainApplication {

    public static void main(String[] args) {

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("cylindrical", "petroleum"));
        bogies.add(new GoodsBogie("open", "coal"));
        bogies.add(new GoodsBogie("box", "grain"));

        // Print Bogies
        System.out.println("goods bogies in train\n");

        for (GoodsBogie b : bogies) {
            System.out.println(b.getType() + " - " + b.getCargo());
        }

        // Safety Check
        SafetyService service = new SafetyService();
        boolean isSafe = service.checkSafety(bogies);

        System.out.println("\nsafety compliance status : " + isSafe);

        if (isSafe) {
            System.out.println("train formation is safe");
        } else {
            System.out.println("train formation is not safe");
        }
    }
}