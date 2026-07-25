package com.orangemask.Service;

import com.orangemask.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.Map;

@Component
public class DealerShipService {
    private Map<String, Car>carMap;
    @Autowired
    public DealerShipService(Map<String, Car>carMap){
        this.carMap = carMap;
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
    public String getDealerShipName(){
        return dealerShipName;
    }
    public String getDealerShipPlace(){
        return dealerShipPlace;
    }



}
