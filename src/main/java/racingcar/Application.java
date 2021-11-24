package racingcar;

import utils.RandomUtils;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Application {

    public static void run(Scanner sc) {
        Conductor conductor = Conductor.setWithCars(sc);
        conductor.start(sc);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        // TODO 구현 진행
        Application.run(scanner);
    }
}
