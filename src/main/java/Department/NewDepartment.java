package Department;

import racingcar.Car;

import java.util.ArrayList;


/**
 * 차량 관리부 <br/>
 * - 검증을 마친 차량을 가짐
 */
public class NewDepartment {

    public ArrayList<Car> carList = new ArrayList<>();
    Center carCenter = new Center();

    public static NewDepartment withCarName(String carName) {
        return new NewDepartment(carName);
    }

    NewDepartment(String carName) {
        this.isRegistrableNewCar(carName);
    }


    public void isRegistrableNewCar(String carName) {

        String[] carNames = carCenter.isSpliterAbleCarName(carName);

        for (String name : carNames) {
            carList.add(carCenter.isNameFiveWord(name));
        }
    }


    public boolean isReadyWithCar() {

        boolean flag = false;

        for (Car car : carList) {
            flag = car.getPosition() == 0;
        }
        return flag;
    }
}
