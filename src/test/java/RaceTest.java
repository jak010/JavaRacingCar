//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import racingcar.Race;
//import utils.RandomUtils;
//
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//
//public class RaceTest {
//
//
//    @Test
//    @DisplayName("차 전진 테스트")
//    void 차_전진_테스트() {
//        Integer pickNumber = RandomUtils.nextInt(1, 3);
//
//        Race race = Race.withCar(pickNumber);
//        assertThat(race.isForward()).isEqualTo(true);
//    }
//
//    @Test
//    @DisplayName("차_후진_테스트")
//    void 차_후진_테스트() {
//        Integer pickNumber = RandomUtils.nextInt(4, 9);
//
//        Race race = Race.withCar(pickNumber);
//        assertThat(race.isBackward()).isEqualTo(true);
//    }
//
//
//}
