package racingcar;

import utils.pio;

import java.util.ArrayList;

public class Race {

    private Manager manager;
    private Round round;

    public static Race withReady(Manager manger, Round round) {
        return new Race(manger, round);
    }

    public Race(Manager manager, Round round) {
        this.manager = manager;
        this.round = round;
    }

    /* Public Interface */

    public void Start() {
        for (int i = 0; i < round.getTotalRound(); i++) {
            manager.receiveByScore(nextRaceContinue());
            pio.EOL();
        }

    }

    /* Implementation */

    /**
     * 등록된 차량의 수만큼 다음 라운드의 스코어를 얻어옴 <br/>
     * Ex) carQuantity = 3 --> [1,2,3]
     */
    private ArrayList<Integer> nextRaceContinue() {
        return round.nextRoundScore(carQuantity());
    }

    /**
     * 등록된 차량의 수를 얻어옴
     */
    private int carQuantity() {
        return manager.storedCarQuantity();
    }

}
