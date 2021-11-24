package racingcar;

import utils.Validation;

import java.util.ArrayList;
import java.util.Arrays;

public class CarCenter extends Validation {

    ArrayList<Car> registeredCars = new ArrayList<>();

    public static CarCenter withCarNames(String carNames) {
        isRegisterAbleInput(carNames);
        return new CarCenter(carNames);
    }

    /**
     * 차 이름이 등록가능한지 확인한 다음 carcenter에 등록
     */
    public CarCenter(String carNames) {
        isRegisterAbleCarName(carNames);
        Arrays.stream(carNames.split(","))
                .forEach(carName -> registeredCars.add(Car.witName(carName)));
    }

    /**
     * 입력한 차 이름이 등록 가능한 차량의 이름인지 확인
     */
    private static void isRegisterAbleInput(String carNames) {
        if (!isIncludeComma(carNames)) {
            throw new RuntimeException("[Error] 콤마(,)가 포함되어 있지 않음");
        }
    }

    /**
     * 입력한 차 개별마다 등록 가능한 이름인지 확인
     */
    private void isRegisterAbleCarName(String carNames) {
        String[] carNamesArray = carNames.split(",");
        for (int i = 0; i < carNamesArray.length; i++) {
            if (!isCarName(carNamesArray[i])) {
                throw new RuntimeException("[Error] 차 이름이 5글자 이상");
            }
        }
    }


    /**
     * 등록 차량의 수
     */
    public int getRegisterCount() {
        return this.registeredCars.size();
    }
}
