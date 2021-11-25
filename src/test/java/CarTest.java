import org.junit.jupiter.api.Test;
import racingcar.Car;

import static org.assertj.core.api.Assertions.assertThat;


public class CarTest {

    @Test
    void 차_생성_테스트() {
        // given
        String carName = "pobi";

        // when
        Car car = new Car("pobi");

        // then
        assertThat(car.getName()).isEqualTo(carName);
    }

    @Test
    void 차_전진_테스트() {
        // given
        int moveFlag = 4;

        // when
        Car car = new Car("pobi");
        car.isForward(moveFlag);

        // then
        assertThat(car.getPosition()).isEqualTo(1);

    }

    @Test
    void 차_정지_테스트(){
        // given
        int moveFlag = 1;

        // when
        Car car = new Car("pobi");
        car.isForward(moveFlag);

        // then
        assertThat(car.getPosition()).isEqualTo(0);

    }

}
