package controller;

import service.TrainService;
import service.TrainServiceImpl;

public class TrainController {

    private final TrainService service;

    public TrainController() {
        this.service = new TrainServiceImpl();
    }

    public void addBogieCapacity(String bogie, int capacity) {
        service.addBogieCapacity(bogie, capacity);
    }

    public void displayFormation() {
        service.displayFormation();
    }
}