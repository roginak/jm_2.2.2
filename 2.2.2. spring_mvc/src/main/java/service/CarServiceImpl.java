package service;

import dao.CarDao;
import dao.CarDaoImpl;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(Integer count) {
        CarDao dao = new CarDaoImpl();
        List<Car> ls = dao.getCars();

        return ls.stream().limit(count == null || count >= 5 ? ls.size() : count).collect(Collectors.toList());
    }
}
