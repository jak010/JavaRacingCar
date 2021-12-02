package racingcar;

import java.util.ArrayList;

public class Manager {

    private String carName;
    private Storage storage;

    public Manager(String carName) {
        this.carName = carName;
        saveCarNameToStorage();
    }

    /**
     * Manager는 score를 받게되면 storage에 차량의 positon을 이동시켜야됨
     */
    /* Public Interface */
    public void receiveByScore(ArrayList<Integer> score) {
        storage.savePositionByScore(score);
    }


    /**
     * 저장된 차의 수량을 리턴
     */
    public int storedCarQuantity() {
        return storage.storageGetCarQuantity();
    }

    /*  Implementation */

    /**
     * 차 이름이 등록가능한 차 이름인지 체크함
     */
    private void saveCarNameToStorage() {

        if (!checkSplitterAbleCarNames()) {
            throw new RuntimeException("[Error] 차는 콤마로 구분되어 복수개로 입력가능해야함");
        }

        for (String each : carNameToStringArray()) {
            checkGreaterThanFiveWord(each);
        }

        setStorage(Storage.withCarNameStrings(carNameToStringArray()));
    }

    /**
     * 차 이름이 콤마(,) 로 구분 가능한지 봄
     */
    private boolean checkSplitterAbleCarNames() {
        return carName.contains(",");
    }

    /**
     * 차 이름이 5글자 이상인 놈들이 있는지 체크함
     */
    private void checkGreaterThanFiveWord(String eachCar) {
        if (eachCar.length() > 5) {
            throw new RuntimeException("[Error] 차의 이름은 5글자 이상은 안됨");
        }
    }

    /**
     * 문자열을 배열로
     */
    private String[] carNameToStringArray() {
        return carName.split(",");
    }


    private void setStorage(Storage storage) {
        this.storage = storage;
    }
}
