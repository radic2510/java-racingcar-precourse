package racingcar.model;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarPositionTest {

    CarPosition carPosition = new CarPosition();

    @DisplayName("시작 포지션 확인")
    @Test
    void initPositionTest() {
        assertThat(carPosition.getPosition()).isEqualTo(0);
    }

    @DisplayName("전진 조건 결과 확인")
    @Test
    void moveForwardTest() {
        assertRandomNumberInRangeTest(
                () -> {
                    carPosition.runRound();
                    assertThat(carPosition.getPosition()).isEqualTo(1);
                },
                4
        );
    }

    @DisplayName("멈추는 조건 결과 확인")
    @Test
    void stopRoundTest() {
        assertRandomNumberInRangeTest(
                () -> {
                    carPosition.runRound();
                    assertThat(carPosition.getPosition()).isEqualTo(0);
                },
                3
        );
    }
}