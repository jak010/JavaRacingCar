package racingcar;


import java.util.Scanner;

public class Application {

    public static void run(String carName, int totalRound) {
        Race race = Race.withReady(new Manager(carName), new Round(totalRound));
        race.Start();
    }


    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행


        Display.MessageOf(1);
        String carName = scanner.nextLine();

        Display.MessageOf(2);
        int totalRound = scanner.nextInt();

        Application.run(carName, totalRound);
    }
}
