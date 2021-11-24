import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import racingcar.CarCenter;
import racingcar.Conductor;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;


public class CarCenterTest {

    public static InputStream generateUserInput(String input) {
        /* Scanner 입력을 위해 테스트로 만든 함수 */
        return new ByteArrayInputStream(input.getBytes());
    }

    @Test
    void 카센터를_통해_차를_입력() {

        // given
        InputStream in = generateUserInput("pobi");
        System.setIn(in);
        final Scanner scanner = new Scanner(System.in);

        //when
//        CarCenter carcenter = CarCenter.withCarNames(scanner.toString());

        //then
        Assertions.assertThrows(RuntimeException.class, () -> CarCenter.withCarNames(scanner.toString()));
    }

    @Test
    void 카센터를_통해_차를_입력하는데_5글자_이상인_경우() {

        // given
        InputStream in = generateUserInput("greentea");
        System.setIn(in);
        final Scanner scanner = new Scanner(System.in);

        //when
//        CarCenter carcenter = CarCenter.withCarNames(scanner.toString());

        //then
        Assertions.assertThrows(RuntimeException.class, () -> CarCenter.withCarNames(scanner.toString()));
    }

}
