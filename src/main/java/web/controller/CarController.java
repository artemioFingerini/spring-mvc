package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.Service.CarService;
import web.Service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;


@Controller()

public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/")
    public String home() {
        return "redirect:/cars";
    }
    @GetMapping(value = "/cars")
    public String printList(@RequestParam(value = "count",required = false,defaultValue = "5") int count,Model model) {
        model.addAttribute("cars",carService.showCountOfCar(carService.myCars(),count));
        return "cars";
    }
}
