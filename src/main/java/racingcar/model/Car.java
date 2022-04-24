package racingcar.model;

public class Car {

    private final CarName name;
    private final CarPosition position;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = new CarPosition();
    }

    public String getName() {
        return this.name.getCarName();
    }

    public int getPosition() {
        return this.position.getPosition();
    }

    public void runRound() {
        this.position.runRound();
    }
}
