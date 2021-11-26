package racingcar;

import Repository.CarRepository;
import round.Race;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Application {

    public static void run(Scanner sc) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        CarRepository carRepository = CarRepository.withCarNames(sc.nextLine());

        System.out.println("시도할 횟수는 몇회인가요?");
        Race race = Race.withRoundLimit(sc.nextInt());

        // Stream을 이용한 Racing 처리
        IntStream.range(0, race.getRoundLimit()).forEach(r -> race.start(carRepository));

        race.End(carRepository);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        // TODO 구현 진행
        Application.run(scanner);
    }
}
