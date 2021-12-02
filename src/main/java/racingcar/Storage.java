package racingcar;

import java.util.ArrayList;

public class Storage {

    private ArrayList<Car> carList = new ArrayList<>();


    public static Storage withCarNameStrings(String[] carNames) {
        return new Storage(carNames);
    }

    public Storage(String[] carName) {
        stringsToArrayList(carName);
    }


    /* Public Interface  */

    /**
     * Storage에 등록된 차량의 수를 리턴
     */
    public int storageGetCarQuantity() {
        return carList.size();
    }

    /**
     * 등록된 차량의 Position을 Score만큼 이동시킴
     */
    public void savePositionByScore(ArrayList<Integer> score) {
        for (int i = 0; i < score.size(); i++) {
            carList.get(i).isForward(score.get(i));
            System.out.println(carList.get(i).getName() + " : " + carList.get(i).getPosition());
        }
    }

    /* Implementation  */

    /**
     * `Car String`을 `Car Object`로 변환해서 저장
     */
    private void stringsToArrayList(String[] carNames) {

        for (String each : carNames) {
            carList.add(new Car(each));
        }
    }
}
