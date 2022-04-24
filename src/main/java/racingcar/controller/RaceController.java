package racingcar.controller;

import racingcar.model.Cars;
import racingcar.model.ConsoleHandler;

public class RaceController {

    private final ConsoleHandler consoleHandler;

    public RaceController() {
        this.consoleHandler = new ConsoleHandler();
    }

    public void raceStart() {

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carNamesInput = consoleHandler.readCarNames();
        Cars cars = new Cars(carNamesInput);

        System.out.println("시도할 회수는 회인가요?");
        int roundNumberInput = consoleHandler.readRoundNumber();

        for (int i = 0; i < roundNumberInput; i++) {
            cars.runRound();
            System.out.println();
        }

    }

}
