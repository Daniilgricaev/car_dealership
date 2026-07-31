package com.orangemask.Service;

import com.orangemask.Car;
import com.orangemask.DAO.dealerShipDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DealerShipService {
    private final dealerShipDAO dealerDAO;
    private Map<String, Car>carMap;
    @Autowired
    public DealerShipService(Map<String, Car>carMap, dealerShipDAO dealerDAO){
        this.carMap = carMap;
        this.dealerDAO = dealerDAO;
    }
    @Value("${car-dealership.name}")
    private String dealerShipName;
    @Value("${car-dealership.place}")
    private String dealerShipPlace;

    public Car getCar(String type){
        Car car;
        if(type.equals("sportCar")){
            car = carMap.get(type);
        }else if(type.equals("hyperCar")){
            car = carMap.get(type);
        }else{
            car = null;
        }
        if(car ==  null){
            System.out.println("Car is not found");
        }
        return car;
    }
    public Car getCarByTypeFromList(String type){
        Car car = carMap.get(type);
        if(car == null){
            System.out.println("The type of car is not found");
        }
        return car;
    }
    public List<Car>getAllCars(){
        return dealerDAO.getCarList();
    }
    public void addCar(Car car){
        dealerDAO.addCar(car);
        System.out.println("Added car" + car.getModelName());
    }
    public Car getCarByName(String name){
        return dealerDAO.findCarByName(name);
    }

    public String getDealerShipName(){
        return dealerShipName;
    }
    public String getDealerShipPlace(){
        return dealerShipPlace;
    }



}
