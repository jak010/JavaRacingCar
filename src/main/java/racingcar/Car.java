package racingcar;

/**
 * Car 자체에 대한 속성  <br/>
 * - 차 이름 <br/>
 * - 몇 번째 차인지 <br/>
 */
public class Car {
    private String name;
    private int position = 0;

    public static Car witName(String carName) {
        return new Car(carName);
    }


    public Car(String carName) {
        this.name = carName;
    }

    // 추가 기능 구현

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

}
