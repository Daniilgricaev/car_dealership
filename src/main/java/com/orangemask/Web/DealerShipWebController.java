package com.orangemask.Web;

import com.orangemask.Car;
import com.orangemask.HyperCar;
import com.orangemask.Service.DealerShipService;
import com.orangemask.SportCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DealerShipWebController {
    private final DealerShipService dealerShipService;
    @Autowired
    public DealerShipWebController(DealerShipService dealerShipService){
        this.dealerShipService = dealerShipService;
    }

    @RequestMapping("/")
    public String redirectToHomePage(){
        return "redirect:/catalog";
    }

    @RequestMapping(value = "/catalog", method = RequestMethod.GET)
    public String getCarCatalog(Model model, @RequestParam(value = "type", required = false , defaultValue = "sport") String type){
        Car car = dealerShipService.getCar(type);
        model.addAttribute("dealerShipName",dealerShipService.getDealerShipName());
        model.addAttribute("dealerShipAddress",dealerShipService.getDealerShipPlace());
        model.addAttribute("car", car.getModelName());
        model.addAttribute("Price", car.getPrice());
        return "catalog-page";
    }
    @RequestMapping(value = "/inventory", method = RequestMethod.GET)
    public String getAllCars(Model model){
        List<Car>carList = dealerShipService.getAllCars();
        model.addAttribute("Cars", carList);
        return "inventory-page";
    }
    @RequestMapping(value = "/add-car", method = RequestMethod.POST)
    public String addCar(@RequestParam("type")String type,
                         @RequestParam("model")String model,
                         @RequestParam("price")int price){
        Car car;
        if("sport".equals(type)){
            car = new SportCar(model, price);
        }else if("hyper".equals(type)){
            car = new HyperCar(model,price,true);
        }else{
            return redirectToHomePage();
        }
        dealerShipService.addCar(car);
        return "redirect:/inventory";
    }
}
