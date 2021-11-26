package utils;


import racingcar.Car;

import java.util.Scanner;

public class pio {

    public static String carNameInput(Scanner sc) {
        return sc.nextLine();
    }

    public static Integer roundInput(Scanner sc) {
        return sc.nextInt();
    }


    /* Game OutPut */
    public static void EOL() {
        System.out.println();
    }

    public static void displayRaceProgress(Car car) {

        System.out.println(DisplayRaceCarName(car) + " : " + DisplayRaceCarPosition(car));
    }

    public static String DisplayRaceCarName(Car car) {
        return car.getName();
    }

    public static String DisplayRaceCarPosition(Car car) {
        String dashString = "";

        for (int i = 0; i < car.getPosition(); i++) {
            dashString += "-";
        }

        return dashString;
    }

    public static void displayGameWinner(String winner) {
        System.out.println("최종 우승자: " + winner);
    }

}
