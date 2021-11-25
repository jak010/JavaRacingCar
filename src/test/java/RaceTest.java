import org.junit.jupiter.api.Test;
import round.RaceRound;
import round.Race;
import utils.RandomUtils;


import static org.assertj.core.api.Assertions.assertThat;


public class RaceTest {


    @Test
    void RACE를_통해_라운드_설정하기(){

        // given
        int raceRound = 3;

        // when
        Race race = Race.withRoundLimit(raceRound);


    }


}
