package round;

import utils.RandomUtils;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Round {

    private int totalRound;


    /**
     * 시합 라운드의 총 횟수를 설정함
     */
    public void setUpTotalRound(int totalRound) {
        this.totalRound = totalRound;
    }


    /**
     * 한 라운드 당 점수를 얻음 <br/>
     * - 자동차 수량만큼 라운드 당 점수를 뽑아냄 <br/>
     * - Ex) 자동차 수량이 3 -> [1,2,3]
     */
    public ArrayList<Integer> getScoreBoard(int carQuantity) {

        ArrayList<Integer> roundScore = new ArrayList<>();

        for (int i = 0; i < carQuantity; i++) {
            roundScore.add(RandomUtils.nextInt(1, 9));
        }

        return roundScore;
    }

    public int getTotalRound() {
        return totalRound;
    }

}
