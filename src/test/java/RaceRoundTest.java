
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import round.RaceRound;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.ARRAY;

public class RaceRoundTest {

    @Test
    void 라운드_생성_테스트() {

        //given
        int roundLimit = 5;

        //when
        RaceRound round = new RaceRound();
        round.initializedRound(roundLimit);

        // then
        assertThat(round.getRoundLimit()).isEqualTo(roundLimit);
    }

    @Test
    void 라운드_당_점수_얻기() {

        // given
        int roundLimit = 1;
        int carQuantity = 3;

        // when
        RaceRound round = new RaceRound();
        round.initializedRound(roundLimit);

        ArrayList<Integer> roundScore = round.getScore(carQuantity);

        // then
        assertThat(roundScore.size()).isEqualTo(carQuantity);
    }

}
