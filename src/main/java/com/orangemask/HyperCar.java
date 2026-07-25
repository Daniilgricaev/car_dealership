package com.orangemask;

import org.springframework.stereotype.Component;

@Component("hyperCar")
public class HyperCar implements Car{
    private String hyperCarName;
    private int price;
    private boolean availability;
    public HyperCar(){
        this.hyperCarName = "Pagani";
        this.price = 335000;
        this.availability = true;
    }
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
