package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String carMethod(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> ls = new ArrayList<>(Arrays.asList(
                new Car("Porshche Taycan", 101010, 0),
                new Car("Porshche 911", 10105, 500),
                new Car("Porshche 360 spider", 101110, 1000),
                new Car("Audi R8", 100111, 0),
                new Car("Mclaren F1", 10101, 10)));

        CarService cs = new CarServiceImpl(ls);
        model.addAttribute("cars", cs.getCars(count));

        return "cars";
    }
}