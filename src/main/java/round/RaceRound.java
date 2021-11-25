package round;

import utils.RandomUtils;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class RaceRound {

    private int roundLimit;


    public void initializedRound(int roundLimit) {
        this.roundLimit = roundLimit;
    }


    /**
     * 한 라운드의 점수를 얻음 <br/>
     */
    public ArrayList<Integer> getScore(int carQuantity) {

        ArrayList<Integer> roundScore = new ArrayList<>();

        for (int i = 0; i < carQuantity; i++) {
            roundScore.add(RandomUtils.nextInt(1, 9));
        }

        return roundScore;
    }

    public int getRoundLimit() {
        return roundLimit;
    }

}
