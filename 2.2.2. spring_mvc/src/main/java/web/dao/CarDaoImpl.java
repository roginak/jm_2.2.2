package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getCars() {
        return new ArrayList<>(Arrays.asList(
                new Car("Porshche Taycan", 101010, 0),
                new Car("Porshche 911", 10105, 500),
                new Car("Porshche 360 spider", 101110, 1000),
                new Car("Audi R8", 100111, 0),
                new Car("Mclaren F1", 10101, 10)));
    }
}
