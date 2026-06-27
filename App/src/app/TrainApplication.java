package app;

import model.GoodsBogie;
import service.CargoService;



public class TrainApplication {

    public static void main(String[] args) {

        CargoService service = new CargoService();

        // ✅ Safe case
        GoodsBogie bogie1 = new GoodsBogie("cylindrical");
        service.assignCargo(bogie1, "petroleum");

        // ❌ Unsafe case
        GoodsBogie bogie2 = new GoodsBogie("rectangular");
        service.assignCargo(bogie2, "petroleum");

        // ✅ Another safe case
        GoodsBogie bogie3 = new GoodsBogie("open");
        service.assignCargo(bogie3, "coal");

        System.out.println("Program continues safely...");
    }
}