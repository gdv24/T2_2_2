package web.service;

import web.Model.Car;

import java.util.List;

public interface ServiceCar {
    List<Car> resultListCar(List<Car> list, int count);
}
