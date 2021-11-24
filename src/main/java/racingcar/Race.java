package racingcar;


import utils.RandomUtils;

import java.util.ArrayList;

/**
 * Race: 차 들의 경주를 관리하는 역할 <br/> - 차가 전진해도 되는지 판단 <br/> - 차가 후진해도 되는지 판단 <br/> - 어떤 차가 등록되어있는지 알고
 * 있어야함 <br/>
 */
public class Race {

    public Integer round;
    public CarRepository carRepository;

    ArrayList<Integer> board = new ArrayList<>();

    public static Race withCarCenter(CarRepository carRepository) {
        return new Race(carRepository);
    }

    public Race(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    /**
     * 3가지 숫자를 뽑음 <br/> - 등록된 차량의 수만큼 점수를 뽑아줘야함 <br/>
     */
    public void extractScore(int roundInput) {
        for (int i = 0; i < carRepository.RegisteredQuantity(); i++) {
//            board.add(RandomUtils.nextInt(1, 9));
            System.out.println(i);
        }
//        this.round = roundInput;
    }

    public boolean isEnd(int conductorRound) {
        return true;
    }

}
