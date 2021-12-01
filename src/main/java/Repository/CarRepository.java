package Repository;


import Department.CarDepartment;
import Department.NewDepartment;
import racingcar.Car;

import java.util.ArrayList;

public class CarRepository extends CarDepartment {

    public static CarRepository withCarNames(String carNames) {
        return new CarRepository(carNames);

    }

    public CarRepository(String carNames) {
        super.initializedCarList(carNames);
    }
}


