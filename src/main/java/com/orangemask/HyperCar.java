package com.orangemask;

import org.springframework.stereotype.Component;

@Component("hyper-car")
public class HyperCar implements Car{
    private String hyperCarName;
    private int price;
    private boolean availability;

    public HyperCar(String hyperCarName, int price, boolean availability){
        this.hyperCarName = hyperCarName;
        this.price = price;
        this.availability = availability;
    }

    @Override
    public String getModelName(){
        return this.hyperCarName;
    }
    @Override
    public int getPrice(){
        return this.price;
    }
}
