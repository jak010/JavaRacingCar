package round;


import Repository.CarRepository;

import java.util.ArrayList;
import java.util.stream.IntStream;

import static utils.pio.*;

public class Race extends Round {


    boolean raceStatus = false;

    public static Race withTotalRound(int totalRound) {
        return new Race(totalRound);
    }

    public Race(int totalRound) {
        super.setUpTotalRound(totalRound);
    }


    /** carRepository에 등록된 차를 레이싱하기
     */
    public void run(CarRepository carRepo) {
        IntStream.range(0, getTotalRound()).forEach(
                r -> begin(carRepo)
        );
    }

    public void begin(CarRepository carRepo) {
        ArrayList<Integer> scoreBoard = getScoreBoard(carRepo.getQuantity());

        for (int i = 0; i < scoreBoard.size(); i++) {
            carRepo.carList.get(i).isForward(scoreBoard.get(i));
            displayRaceProgress(carRepo.carList.get(i));
        }

        setRaceStatus(true);
    }

    public void End(CarRepository carRepository) {
        String winner = "";

        int winnerPosition = carRepository.getWinnerPosition();

        for (int i = 0; i < carRepository.carList.size(); i++) {
            if (winnerPosition == carRepository.carList.get(i).getPosition()) {
                winner += carRepository.carList.get(i).getName() + " ";
            }

        }

        displayGameWinner(winner);
    }

    public boolean isRaceStatus() {
        return raceStatus;
    }

    public void setRaceStatus(boolean raceStatus) {
        this.raceStatus = raceStatus;
    }
}
