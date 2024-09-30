package web.Service;

import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> myCars() {
        return List.of(new Car("Peugeot","Black",1993),
        new Car("BMW","Blue",1995),
        new Car("Audi","White",1999),
        new Car("Reno","Red",2001),
        new Car("Porsche","Black",2003));
    }

    @Override
    public List<Car> showCountOfCar(List<Car> cars, int count) {
        if(count <= 0 || count >=5) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }

    }

}
