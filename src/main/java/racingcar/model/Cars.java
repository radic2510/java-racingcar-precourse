package racingcar.model;

import static racingcar.util.CustomUtils.stringSplitByComma;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> carList;

    public Cars(String carNamesInput) {
        this.carList = new ArrayList<>();

        for (String carName : stringSplitByComma(carNamesInput)) {
            this.carList.add(new Car(carName));
        }
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void runRound() {
        for (Car car : carList) {
            car.runRound();
        }
    }

}
