package service;

import model.Train;


import java.util.Map;

public class TrainServiceImpl implements TrainService {

    private final Train train = new Train();

    @Override
    public void addBogieCapacity(String bogie, int capacity) {
        train.getBogieCapacityMap().put(bogie, capacity);
    }

    @Override
    public void displayFormation() {
        for (Map.Entry<String, Integer> entry : train.getBogieCapacityMap().entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }
    }
}