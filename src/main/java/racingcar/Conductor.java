package racingcar;

import utils.pio;

import java.util.Scanner;

/**
 * Conductor: 게임의 진행을 관리하는 역할임 <br/>
 * - 게임 라운드 수 설정 <br/>
 * - 자동차 이름을 입력하는 사람 <br/>
 */
public class Conductor extends pio {

    Race race;
    CarCenter carCenter;

    public Conductor(Scanner sc) {
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
        this.carCenter = CarCenter.withCarNames(carNameInput(sc));

        System.out.println("시도할 회수는 몇회인가요?");
        this.race = Race.withRoundNumber(sc.nextInt());
    }

    public void start() {
        race.setRegisteredCount(carCenter.getRegisterCount());

        System.out.println("실행 결과");
        for (int i = 0; i < race.getRoundNumber(); i++) {
            carCenter.registeredCars.get(i).setPosition(race.flagNumbers().get(i));

            System.out.println(carCenter.registeredCars.get(i).getName() + ":" +
                    "-".repeat(carCenter.registeredCars.get(i).getPosition()));
        }


    }
}


