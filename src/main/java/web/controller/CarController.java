package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.Service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {
    @Autowired
    private CarServiceImpl carService;

    @GetMapping(value = "/cars")
    public String printList(@RequestParam(value = "count",required = false,defaultValue = "5") int count,Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Peugeot","Black",1993));
        cars.add(new Car("BMW","Blue",1995));
        cars.add(new Car("Audi","White",1999));
        cars.add(new Car("Reno","Red",2001));
        cars.add(new Car("Porsche","Black",2003));
        model.addAttribute("cars",carService.showCountOfCar(cars,count));
        return "cars";
    }

}
