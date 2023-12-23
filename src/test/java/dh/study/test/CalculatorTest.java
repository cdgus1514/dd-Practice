package dh.study.test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 요구사항
 * 간단한 사칙연산
 * 양수로만 계산을 할 수 있다.
 * 나눗셈에서 0을 나누는 경우 예외 발생
 * MVC패턴 기반으로 구현
 */
public class CalculatorTest {

    @DisplayName("덧셈 연산을 정상적으로 수행한다.")
    @Test
    void 덧셈연산() throws Exception {

        int result = Calcuator.calculate(1, "+", 2);

        assertThat(result).isEqualTo(3);
    }

}
