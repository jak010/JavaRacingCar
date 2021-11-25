package Repository;


import Department.CarDepartment;

public class CarRepository extends CarDepartment {


    public static CarRepository withCarNames(String carNames) {
        return new CarRepository(carNames);

    }

    public CarRepository(String carNames) {
        super.initializedCarList(carNames);
    }


}
