package service;

import model.Bogie;

import java.util.ArrayList;
import java.util.List;

public class BogieServiceImpl implements BogieService {

    private final List<Bogie> bogies = new ArrayList<>();

    @Override
    public void addBogie(Bogie bogie) {
        bogies.add(bogie);
    }

    @Override
    public List<Bogie> getAllBogies() {
        return bogies;
    }

    @Override
    public int getTotalSeatingCapacity() {
        return bogies.stream()
                .map(Bogie::getActualSeats)
                .reduce(0, Integer::sum);
    }
}