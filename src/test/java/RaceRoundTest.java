
import org.junit.jupiter.api.Test;
import round.Round;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class RaceRoundTest {

    @Test
    void 라운드_생성_테스트() {

        //given
        int roundLimit = 5;

        //when
        Round round = new Round();
        round.setUpTotalRound(roundLimit);

        // then
        assertThat(round.getTotalRound()).isEqualTo(roundLimit);
    }

    @Test
    void 라운드_당_점수_얻기() {

        // given
        int roundLimit = 1;
        int carQuantity = 3;

        // when
        Round round = new Round();
        round.setUpTotalRound(roundLimit);

        ArrayList<Integer> roundScore = round.getScoreBoard(carQuantity);

        // then
        assertThat(roundScore.size()).isEqualTo(carQuantity);
    }

}
