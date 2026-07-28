package com.orangemask.Web;

import com.orangemask.Car;
import com.orangemask.Service.DealerShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String getCarCatalog(Model model, @RequestParam("type") String type){
        Car car = dealerShipService.getCar(type);
        model.addAttribute("dealerShipName",dealerShipService.getDealerShipName());
        model.addAttribute("dealerShipAddress",dealerShipService.getDealerShipPlace());
        model.addAttribute("car", car.getModelName());
        return "catalog-page";
    }
}
