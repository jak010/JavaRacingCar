package racingcar;

import utils.Validation;

import java.util.ArrayList;
import java.util.Arrays;

public class CarRepository extends Validation {

    ArrayList<Car> carList = new ArrayList<>();

    public static CarRepository withCarNames(String carNames) {
        isRegisterAbleInput(carNames);
        return new CarRepository(carNames);
    }

    /**
     * 차 이름이 등록가능한지 확인한 다음 carcenter에 등록
     */
    public CarRepository(String carNames) {
        isRegisterAbleCarName(carNames);
        Arrays.stream(carNames.split(","))
            .forEach(carName -> carList.add(new Car(carName)));
    }

    /**
     * 입력한 차 이름이 등록 가능한 차량의 이름인지 확인 <br/> - 관리인(Conductor)이 입력한 차 이름은 콤마(,)로 구분되는지 체크함 <br/>
     */
    private static void isRegisterAbleInput(String carNames) {
        if (!isIncludeComma(carNames)) {
            throw new RuntimeException("[Error] 콤마(,)가 포함되어 있지 않음");
        }
    }

    /**
     * 입력한 차 개별마다 등록 가능한 이름인지 확인 <br/> - 각 차마다 5글자의 이하의 길이를 가짐
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
    public int RegisteredQuantity() {
        return carList.size();
    }
}
