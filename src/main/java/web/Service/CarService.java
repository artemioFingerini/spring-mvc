package web.Service;

import web.Model.Car;
import java.util.List;

public interface CarService {
    List<Car> myCars();
    List <Car> showCountOfCar(List<Car> cars, int count);

}
