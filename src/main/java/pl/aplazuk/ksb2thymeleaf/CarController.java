package pl.aplazuk.ksb2thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

    @GetMapping("/car")
    public String getCar(Model model){
        Car car = new Car("BMW", "X1");

        model.addAttribute("name", "Bolka");
        model.addAttribute("car", car);
        return "car";
    }
}
