package Department;

import racingcar.Car;

public class Center {


    /**
     * 입력한 차 이름에 콤마가 포함되어있는지 검증함
     */
    public String[] isSpliterAbleCarName(String carName) {
        if (!carName.contains(",")) {
            throw new RuntimeException("[Error] 차는 콤마로 구분되어 복수개로 입력가능해야함");
        }
        return carName.split(",");
    }


    /**
     * 입력한 차량의 단건 이름이 5글자인지 검증
     */
    public Car isNameFiveWord(String carName) {
        if (carName.length() > 5) {
            throw new RuntimeException("[Error] 차의 이름은 5글자 미만이어야함");
        }
        return new Car(carName);
    }
}
