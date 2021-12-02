package racingcar;

import utils.RandomUtils;

import java.util.ArrayList;

public class Round {

    private int totalRound;

    public Round(int totalRound) {
        this.totalRound = totalRound;
    }

    /**
     * 다음 라운드의 점수를 반환해줌
     */
    public ArrayList<Integer> nextRoundScore(int carQuantity) {
        ArrayList<Integer> nextScore = new ArrayList<>();

        for (int i = 0; i < carQuantity; i++) {
            nextScore.add(RandomUtils.nextInt(1, 9));
        }
        return nextScore;
    }

    public int getTotalRound() {
        return totalRound;
    }
}
