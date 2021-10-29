package web.service;

import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ServiceCarImpl implements ServiceCar {

    public List<Car> resultListCar(List<Car> list,int count) {
        if (count < 5 ){
            return list.stream().limit(count).collect(Collectors.toList());
        } else {
            return list;
        }
    }

}
