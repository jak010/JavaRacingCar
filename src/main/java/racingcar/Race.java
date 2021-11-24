package racingcar;

import org.graalvm.compiler.asm.amd64.AMD64Assembler;
import utils.RandomUtils;

import java.util.ArrayList;
import java.util.Random;

/**
 * Race: 차 들의 경주를 관리하는 역할 <br/>
 * - 차가 전진해도 되는지 판단 <br/>
 * - 차가 후진해도 되는지 판단 <br/>
 * - 어떤 차가 등록되어있는지 알고 있어야함 <br/>
 */
public class Race {


    public Integer roundNumber;
    public int registeredCount;


    public static Race withRoundNumber(Integer roundNumber) {
        return new Race(roundNumber);
    }

    public Race(Integer roundNumber) {
        this.roundNumber = roundNumber;
    }

    /**
     * 차 수량에 맞춰서 전진 혹은 후진 뽑음
     */
    public ArrayList<Integer> flagNumbers() {
        ArrayList<Integer> flagNumbers = new ArrayList<>();

        for (int i = 0; i < registeredCount; i++) {
            flagNumbers.add(RandomUtils.nextInt(1, 9));
        }

        return flagNumbers;
    }


    public Integer getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(Integer roundNumber) {
        this.roundNumber = roundNumber;
    }

    public int getRegisteredCount() {
        return registeredCount;
    }

    public void setRegisteredCount(int registeredCount) {
        this.registeredCount = registeredCount;
    }

}
