package racingcar.model;

import camp.nextstep.edu.missionutils.Console;

public class ConsoleHandler {

    public String readCarNames() {
        String userInput = Console.readLine();

        validateEmptyInput(userInput);

        return userInput;
    }

    public int readRoundNumber() {
        String userInput = Console.readLine();

        validateEmptyInput(userInput);
        validateNumberInput(userInput);

        return Integer.parseInt(userInput);
    }


    public void validateEmptyInput(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException("[ERROR] 입력 값은 공백일 수 없습니다.");
        }
    }

    public void validateNumberInput(String input) {
        if (!isContainOnlyNumber(input)) {
            throw new IllegalArgumentException("[ERROR] 숫자만 입력 가능합니다.");
        }
    }

    public boolean isContainOnlyNumber(String input) {
        return input.matches("^[0-9]*$");
    }

}
