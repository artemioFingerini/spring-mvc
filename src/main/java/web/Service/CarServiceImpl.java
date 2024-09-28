package web.Service;

import org.springframework.stereotype.Service;
import web.Model.Car;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> showCountOfCar(List<Car> cars, int count) {
        if(count <= 0 || count >=5) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
