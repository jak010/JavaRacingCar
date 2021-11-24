package racingcar;

import java.lang.reflect.Modifier;
import utils.pio;

import java.util.Scanner;

/**
 * Conductor: 게임의 진행을 관리하는 역할임 <br/> - 게임 라운드 수 설정 <br/> - 자동차 이름을 입력하는 사람 <br/>
 */
public class Conductor extends pio {

    Race race;
    CarRepository carRepository;

    public static Conductor setWithCars(Scanner sc) {
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
        return new Conductor(sc);
    }

    public Conductor(Scanner sc) {
        this.carRepository = CarRepository.withCarNames(carNameInput(sc));
        this.race = Race.withCarCenter(carRepository);
    }

    public void start(Scanner sc) {
        System.out.println("시도할 회수는 몇회인가요?");
        int roundInput = roundInput(sc);

        for (int i = 0; i < roundInput + 1; i++) {
            race.extractScore(roundInput);
        }
        for (int i = 0; i < race.board.size(); i++) {
            System.out.println(race.board.get(i));
        }

//        Monitor monitor = new Monitor(race, carRepository);
//        monitor.reflectScore();

//        if (race.isEnd(roundNumber)) {
//            System.out.println("최종 우승자: ");
//        }
    }

    public void end() {

    }
}


