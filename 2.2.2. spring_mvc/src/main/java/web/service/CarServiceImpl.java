package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.CarDao;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao dao;

    @Autowired
    public CarServiceImpl(CarDao dao) {
        this.dao = dao;
    }


    @Override
    public List<Car> getCars(Integer count) {
        List<Car> ls = dao.getCars();

        return ls.stream().limit(count == null || count >= 5 ? ls.size() : count).collect(Collectors.toList());
    }
}
