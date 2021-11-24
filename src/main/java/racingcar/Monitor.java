package racingcar;


/**
 * 이름 미정, 더 좋은 이름 필요함
 */
public class Monitor {

    private Race race;
    private CarRepository carRepository;

    public Monitor(Race race, CarRepository carRepository) {
        this.race = race;
        this.carRepository = carRepository;

    }


    public void reflectScore() {

        for (int i = 0; i < race.board.size(); i++) {
            carRepository.carList.get(i).Move(race.board.get(i));
            System.out.println(carRepository.carList.get(i).getName());
        }

    }


}
