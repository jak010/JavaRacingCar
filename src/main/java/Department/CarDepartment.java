package Department;

import racingcar.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class CarDepartment {


    public ArrayList<Car> carList = new ArrayList<Car>();

    /**
     * 입력된 차량이 콤마(,)로 구분되는지 확인 <br/>
     *
     * @return true
     */
    public boolean isSplitStandardCharacter(String carNames) {
        return carNames.contains(",");
    }

    public void initializedCarList(String carName) {

        if (!carName.contains(",")) {
            throw new RuntimeException("[Error] 차는 콤마로 구분되어 복수개로 입력가능해야함");
        }

        initialized(carName.split(","));
    }

    private void initialized(String[] carNames) {
        for (String carName : carNames) {
            if (carName.length() > 5) {
                throw new RuntimeException("[Error] 차의 이름은 5글자 미만이어야함");
            }
            carList.add(new Car(carName));
        }
    }

    /**
     * 등록된 차량의 수 리턴
     */
    public int getQuantity() {
        return carList.size();

    }

    public int getWinnerPosition() {
        int winnerPosition = 0;

        for (int i = 0; i < carList.size(); i++) {
            if (winnerPosition < carList.get(i).getPosition()) {
                winnerPosition = carList.get(i).getPosition();
            }

        }
        return winnerPosition;
    }

}
