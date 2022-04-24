package racingcar.model;

public class Car {

    private static final int MAX_CAR_NAME_LENGTH = 5;
    private final String carName;
    private int position = 0;

    public Car(String carName) {
        validateCarNameLength(carName);
        this.carName = carName;
    }

    private void validateCarNameLength(String carName) {
        if (carName.length() > MAX_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 최대 5자 까지 가능하다.");
        }

        if (carName.isEmpty()) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 공백이 될 수 없다.");
        }
    }

    public String getCarName() {
        return carName;
    }

    public int getPosition() {
        return position;
    }

    public void goForward() {
        this.position++;
    }
}
