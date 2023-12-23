package dh.study.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class UserTest {

    @DisplayName("패스워드를 초기화 한다.")
    @Test
    void initPassword() {
        // given
        User user = new User();

        // when
//        user.initPassword(new CorrectFixedPasswordGenerator());
        user.initPassword(() -> "aabbccdd"); // functional interface로 구현체를 직접 만들필요가 없어짐

        assertThat(user.getPassowrd()).isNotNull();
    }


    @DisplayName("패스워드가 요구사항에 부합하여 초기화가 안된다.")
    @Test
    void initPassword2() {
        // given
        User user = new User();

        // when
//        user.initPassword(new WrongFixedPasswordGenerator());
        user.initPassword(() -> "aa");

        assertThat(user.getPassowrd()).isNull();
    }

}