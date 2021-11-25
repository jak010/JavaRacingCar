package Department;

public class CarDepartment {

    /**
     * 입력된 차량이 콤마(,)로 구분되는지 확인 <br/>
     *
     * @return true
     */
    public boolean isSplitStandardCharacter(String carNames) {
        return carNames.contains(",");
    }

    public boolean isRegisterCarName(String carName) {
        return carName.length() < 5;

    }

}
