import static org.assertj.core.api.Assertions.assertThat;

import Department.CarDepartment;
import org.junit.jupiter.api.Test;

public class DepartmentTest {

    @Test
    void 차량_입력_통과_테스트() {
        // given
        String carNames = "pobi,dobi";

        // when
        CarDepartment department = new CarDepartment();


        //then
        assertThat(department.isSplitStandardCharacter(carNames)).isEqualTo(true);
    }

    @Test
    void 차량_입력_실패_테스트() {

        // given
        String carNames = "pobidobi";

        // when
        CarDepartment department = new CarDepartment();


        // then
        assertThat(department.isSplitStandardCharacter(carNames)).isEqualTo(false);
    }

    @Test
    void 차_이름_유효성_통과_테스트() {

        // given
        String carName = "pobi";

        // when
        CarDepartment department = new CarDepartment();

        // then
        assertThat(department.isRegisterCarName(carName)).isEqualTo(true);
    }

    @Test
    void 차_이름_유효성_실패_테스트() {

        // given
        String carName = "pobid";

        // when
        CarDepartment department = new CarDepartment();

        // then
        assertThat(department.isRegisterCarName(carName)).isEqualTo(false);
    }
}
