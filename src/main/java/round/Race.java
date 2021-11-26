package round;


import Repository.CarRepository;
import sun.text.resources.CollationData;

import static utils.pio.raceProgress;
import static utils.pio.EOL;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Race extends RaceRound {

    public static Race withRoundLimit(int roundLimit) {
        return new Race(roundLimit);
    }

    public Race(int roundLimit) {
        super.initializedRound(roundLimit);
    }

    public void begin(CarRepository carRepo) {
        ArrayList<Integer> scoreBoard = getScore(carRepo.getQuantity());

        System.out.println(scoreBoard);
        for (int i = 0; i < scoreBoard.size(); i++) {
            carRepo.carList.get(i).isForward(scoreBoard.get(i));
            raceProgress(carRepo.carList.get(i));
        }

        EOL();
    }

    public void End(CarRepository carRepository) {
        String winners = "";

        int winnerPosition = carRepository.getWinnerPosition();

        for (int i = 0; i < carRepository.carList.size(); i++) {
            if (winnerPosition == carRepository.carList.get(i).getPosition()) {
                winners += carRepository.carList.get(i).getName() + " ";
            }

        }

        System.out.println("최종 우승자: " + winners);
    }


}
