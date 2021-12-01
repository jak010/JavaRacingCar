package racingcar;

import Department.NewDepartment;
import Repository.CarRepository;
import round.NewRace;
import round.NewRound;
import round.Race;

import java.util.Scanner;

public class Application {
    static CarRepository carRepository;
    static Race race;


    public static void run() {

        if (!race.isRaceStatus()) {
            race.run(carRepository);
        }


        if (race.isRaceStatus()) {
            race.End(carRepository);
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행

//        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
//        carRepository = CarRepository.withCarNames(scanner.nextLine());
//
//        System.out.println("시도할 횟수는 몇회인가요?");
//        race = Race.withTotalRound(scanner.nextInt());
//
//        Application.run();

        // version 2
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carName = scanner.nextLine();

        System.out.println("시도할 횟수는 몇회인가요?");
        int totalRound = scanner.nextInt();

        NewRace.withStart(NewDepartment.withCarName(carName),
                NewRound.withTotalRound(totalRound));
    }
}
