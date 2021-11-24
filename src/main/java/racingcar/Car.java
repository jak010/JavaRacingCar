package racingcar;

/**
 * Car 자체에 대한 속성  <br/> - 차 이름 <br/> - 몇 번째 차인지 <br/>
 */
public class Car {

    private String name;
    private int position = 0;

    // 기본 생성자를 추가하지 말라고 한다..
//    public static Car witName(String carName) {
//        return new Car(carName);
//    }


    public Car(String carName) {
        this.name = carName;
    }

    // 추가 기능 구현
    public void Move(int flag) {
        if (flag >= 4) {
            moveForward();
        }
    }

    public void moveForward() {
        this.position += 1;
    }

    public String getName() {
        return this.name;
    }
}
