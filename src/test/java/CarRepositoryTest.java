import Repository.CarRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;


public class CarRepositoryTest {

    @Test
    @DisplayName("차고지를 통해 차를 단건으로 입력하는 정상 케이스")
    void 차고지를_통해_단건_입력하기() {

        //given
        String carNames = "pobi,";

        //when
        CarRepository carRepository = CarRepository.withCarNames(carNames);

        // then
        assertThat(carRepository.getQuantity()).isEqualTo(1);
    }


    @Test
    @DisplayName("차고지를 통해 차를 다건으로 입력하는 정상 케이스")
    void 차고지를_통해_다건_입력하기() {

        //given
        String carNames = "pobi,dobi";

        //when
        CarRepository carRepository = CarRepository.withCarNames(carNames);

        // then
        assertThat(carRepository.getQuantity()).isEqualTo(2);
    }
}
