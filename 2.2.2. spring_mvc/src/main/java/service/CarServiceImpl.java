package service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    private List<Car> ls;

    public CarServiceImpl(List<Car> ls) {
        this.ls = ls;
    }

    @Override
    public List<Car> getCars(Integer count) {
        return count == null || count >= 5 ? ls : ls.subList(0, count);
    }
}
