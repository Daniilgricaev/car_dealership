package com.orangemask.DAO;

import com.orangemask.Car;
import com.orangemask.HyperCar;
import com.orangemask.SportCar;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository

public class dealerShipDAO {

    private final List<Car>carList = new ArrayList<>(
            Arrays.asList(
                    new SportCar("Ferrari spider", 275000),
                    new HyperCar("Bugatti veyron", 1000000, true)
            )
    );

    public List<Car> getCarList() {
        return new ArrayList<>(carList);
    }

    public void addCar(Car car){
        if(car != null){
            carList.add(car);
        }
    }

    public Car findCarByName(String carName){
        return carList.stream().filter(car -> car.getModelName().equals(carName))
                      .findFirst().orElse(null);
    }



}
