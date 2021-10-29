package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.service.ServiceCar;
import web.service.ServiceCarImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "cars")
    public String cars (@RequestParam(value = "count", required = false) String strCount, Model model){
        int count = 0;
        if (strCount == null) {
            count = 5;
        } else {
            count = Integer.parseInt(strCount);
        }
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("toyota", 100,"red"));
        carList.add(new Car("nissan", 200,"white"));
        carList.add(new Car("bmw", 300,"black"));
        carList.add(new Car("mercedes", 400,"blue"));
        carList.add(new Car("lada", 500,"none"));
        ServiceCar serviceCar = new ServiceCarImpl();
        model.addAttribute("messege",serviceCar.resultListCar(carList, count));
        return "cars";
    }
}
