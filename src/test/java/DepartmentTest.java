import static org.assertj.core.api.Assertions.assertThat;

import Department.CarDepartment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DepartmentTest {


    @Test
    @DisplayName("콤마로 구분하고 차량을 입력할 때")
    void 차량_입력_통과_테스트() {
        // given
        String carNames = "pobi,dobi";

        // when
        CarDepartment department = new CarDepartment();

        //then
        assertThat(department.isSplitStandardCharacter(carNames)).isEqualTo(true);
    }


    @Test
    @DisplayName("콤마로 구분되지 않고 차 이름이 5글자 이상일 떄")
    void 차량_입력_실패_테스트() {

        // given
        String carNames = "pobidobi";

        // when
        CarDepartment department = new CarDepartment();

        // then
        Assertions.assertThrows(RuntimeException.class, () -> {
            department.initializedCarList(carNames);
        });

    }

    @Test
    @DisplayName("콤마로 구분되고 차 이름이 5글자 이하일 떄")
    void 차_이름_유효성_통과_테스트() {

        // given
        String carName = "pobi,dobi";

        // when
        CarDepartment department = new CarDepartment();
        department.initializedCarList(carName);

        // then
        assertThat(department.getQuantity()).isEqualTo(2);
    }

    @Test
    @DisplayName("콤마로 구분되지 않고 차량 이름이 5글자 이하일 떄")
    void 차_이름_유효성_실패_테스트() {

        // given
        String carName = "pobid";

        // when
        CarDepartment department = new CarDepartment();

        // then
        Assertions.assertThrows(RuntimeException.class, () -> {
            department.initializedCarList(carName);
        });
    }
}
