package controller;

import model.Bogie;
import service.BogieService;
import service.BogieServiceImpl;

import java.util.List;

public class BogieController {

    private final BogieService service;

    public BogieController() {
        this.service = new BogieServiceImpl();
    }

    public void addBogie(String name, int displayCount, int actualSeats) {
        service.addBogie(new Bogie(name, displayCount, actualSeats));
    }

    public List<Bogie> getAllBogies() {
        return service.getAllBogies();
    }

    public int getTotalCapacity() {
        return service.getTotalSeatingCapacity();
    }
}