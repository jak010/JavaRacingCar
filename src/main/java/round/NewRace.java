package round;


import Department.NewDepartment;

public class NewRace {

    NewRound newRound;
    NewDepartment newDepartment;

    public static void withStart(NewDepartment department, NewRound newRound) {
        new NewRace(department, newRound).Start();
    }

    public NewRace(NewDepartment department, NewRound newRound) {
        this.newDepartment = department;
        this.newRound = newRound;

    }

    public void Start() {
        newRound.play(newDepartment);
    }

}
