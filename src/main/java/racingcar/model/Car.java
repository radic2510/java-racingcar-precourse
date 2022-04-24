package racingcar.model;

import static racingcar.util.CustomUtils.getRandomNumber;

public class Car {

    private final int MIN_NUMBER_FOR_MOVE = 4;

    private final CarName name;
    private final CarPosition position;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = new CarPosition();
    }

    public String getName() {
        return name.getCarName();
    }

    public int getPosition() {
        return position.getPosition();
    }

    public void runRound() {
        int randomNumber = getRandomNumber();

        if (isMove(randomNumber)) {
            position.goForward();
        }
    }

    private boolean isMove(int randomNumber) {
        return randomNumber >= MIN_NUMBER_FOR_MOVE;
    }


}
