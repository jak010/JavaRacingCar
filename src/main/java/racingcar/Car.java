package racingcar;

/**
 * Car 자체에 대한 속성  <br/> - 차 이름 <br/> - 몇 번째 차인지 <br/>
 */
public class Car {

    private String name;
    private int position = 0;

    public Car(String carName) {
        this.name = carName;
    }


    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    /**
     * 4이상일 경우 전진한다
     */
    public void isForward(int moveFlag) {
        if (moveFlag >= 4) {
            this.position += 1;
        }
    }


}