import org.junit.jupiter.api.Test;
import round.Race;


import static org.assertj.core.api.Assertions.assertThat;


public class RaceTest {


    @Test
    void RACE를_통해_라운드_설정하기(){

        // given
        int raceRound = 3;

        // when
        Race race = Race.withTotalRound(raceRound);


    }


}
