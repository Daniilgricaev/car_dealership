package com.orangemask;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("sportCar")
public class SportCar implements Car {
    private String sportCarName;
    private int price;
    public SportCar(String sportCarName, int price){
        this.sportCarName = sportCarName;
        this.price = price;
    }
    @Override
    public String getModelName(){
        return this.sportCarName;
    }
    @Override
    public int getPrice(){
        return this.price;
    }
}
