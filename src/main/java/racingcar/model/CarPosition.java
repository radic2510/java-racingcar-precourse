package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class CarPosition {

    private int position;
    private final int START_POSITION = 0;
    private final int MIN_NUMBER_FOR_MOVE = 4;

    public CarPosition() {
        this.position = START_POSITION;
    }

    public int getPosition() {
        return position;
    }

    public void runRound() {
        int randomNumber = getRandomNumber();

        if (isMove(randomNumber)) {
            goForward();
        }
    }

    private boolean isMove(int randomNumber) {
        return randomNumber >= MIN_NUMBER_FOR_MOVE;
    }

    private int getRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }

    private void goForward() {
        this.position++;
    }
}
