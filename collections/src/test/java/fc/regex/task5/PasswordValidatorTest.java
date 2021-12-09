package fc.regex.task5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {


    @ParameterizedTest
    @ValueSource(strings = {"Aaa4567", "123Bxyz", "123B!as", "@23Bxyz", "@A20xz!aOo", "2020aOo22XX"})
    void checkPasswordIsValid(String password) {
        assertTrue(PasswordValidator.checkPassword(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "aaa4567", "abcBxyz", "A2021!a", "@A21xz!a", "A1234", "123456789"})
    void checkPasswordIsNotValid(String password) {
        assertFalse(PasswordValidator.checkPassword(password));
    }
}
