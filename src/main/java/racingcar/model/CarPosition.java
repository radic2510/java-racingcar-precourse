package racingcar.model;

public class CarPosition {

    private int position;

    public CarPosition() {
        this.position = 0;
    }

    public int getPosition() {
        return position;
    }

    public void runRound() {

    }

    private void goForward() {
        this.position++;
    }
}
