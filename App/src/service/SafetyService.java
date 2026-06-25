package service;

import model.GoodsBogie;
import java.util.List;

public class SafetyService {

    public boolean checkSafety(List<GoodsBogie> bogies) {

        return bogies.stream()
                .allMatch(b -> {
                    if (b.getType().equalsIgnoreCase("cylindrical")) {
                        return b.getCargo().equalsIgnoreCase("petroleum");
                    }
                    return true;
                });
    }
}