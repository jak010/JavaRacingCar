package racingcar;

public enum Display {

    INPUT_CAR_NAME(1, "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    INPUT_TOTAL_ROUND(2, " 시도할 횟수는 얼마인가요?");

    private static final Display[] DIR_ARR = Display.values();
    private final int value;
    private final String message;

    public static void MessageOf(int value) {
        System.out.println(DIR_ARR[value - 1].message);
    }

    Display(int value, String message) {
        this.value = value;
        this.message = message;
    }
}
