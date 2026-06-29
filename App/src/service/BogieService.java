package service;

import model.Bogie;
import java.util.List;

public interface BogieService {

    void addBogie(Bogie bogie);

    List<Bogie> getAllBogies();

    int getTotalSeatingCapacity();
}