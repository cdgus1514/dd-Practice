package dh.study.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * 요구사항
 * 간단한 사칙연산
 * 양수로만 계산을 할 수 있다.
 * 나눗셈에서 0을 나누는 경우 예외 발생
 * MVC패턴 기반으로 구현
 */
public class CalculatorTest {

    @DisplayName("덧셈 연산을 정상적으로 수행한다.")
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void 사칙연산테스트(int op1, String operator, int op2, int result) throws Exception {

        int calculate = Calcuator.calculate(op1, operator, op2);

        assertThat(calculate).isEqualTo(result);
    }

    private static Stream<Arguments> formulaAndResult() {
        return Stream.of(
                arguments(1, "+", 2, 3),
                arguments(2, "-", 1, 1),
                arguments(1, "*", -1, -1),
                arguments(4, "/", 2, 2)
        );
    }

}
