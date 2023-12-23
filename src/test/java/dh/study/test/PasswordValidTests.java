package dh.study.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;


/**
 * 1. 비밀번호는 8자 이상 12자 이하여야 한다.
 * 2. 비민번호가 8자 미만 또는 12자 이상이면 IllegalArgumentException 예외를 발생시킨다.
 * 3. 경계조건에 대한 테스트코드를 작성한다.
 */
public class PasswordValidTests {

    @DisplayName("비밀번호가 최소 8자 이상, 12자 이하면 에러가 발생하지 않는다.")
    @Test
    void validatePasswordTest() {
        assertThatCode(() -> PasswordValidator.validate("testtest"))
                .doesNotThrowAnyException();

    }

    @DisplayName("비밀번호가 8자 미만, 12자 초과하는 경우 에러가 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"aabbcce", "aabbccddeeffg"})
    void validatePasswordTest2(String password) {
         assertThatCode(() -> PasswordValidator.validate(password))
                 .isInstanceOf(IllegalArgumentException.class)
                 .hasMessage("비밀번호는 8자 이상 12자 이하여야 한다.");

    }
}
