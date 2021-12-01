package round;

import Department.NewDepartment;
import utils.RandomUtils;
import utils.pio;

import java.util.ArrayList;

/**
 * Act 1. 등록된 차량의 수 만큼 한 라운드의 점수를 알려줌 <br/>
 */
public class NewRound {

    public int totalRound;


    public static NewRound withTotalRound(int totalRound) {
        return new NewRound(totalRound);
    }

    public NewRound(int totalRound) {
        this.totalRound = totalRound;
    }

    public void play(NewDepartment department) {


        for (int i = 0; i < totalRound; i++) {
            reflectCarPosition(department);
            pio.newDisplayRaceProgress(department);
            pio.EOL();
        }

    }

    private void reflectCarPosition(NewDepartment department) {
        ArrayList<Integer> currentScore = nextRoundScore(department);

        for (int i = 0; i < currentScore.size(); i++) {
            department.carList.get(i).isForward(currentScore.get(i));
        }
    }

    public ArrayList<Integer> nextRoundScore(NewDepartment department) {
        ArrayList<Integer> roundScore = new ArrayList<>();

        for (int i = 0; i < department.carList.size(); i++) {
            roundScore.add(RandomUtils.nextInt(1, 9));
        }
        return roundScore;
    }

}



