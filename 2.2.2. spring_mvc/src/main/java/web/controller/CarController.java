package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String carMethod(@RequestParam(value = "count", required = false) Integer count, Model model) {

        CarService cs = new CarServiceImpl();
        model.addAttribute("cars", cs.getCars(count));

        return "cars";
    }
}