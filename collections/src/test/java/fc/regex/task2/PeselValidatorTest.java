package fc.regex.task2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

class PeselValidatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"20022002999", "00000000000"})
    void checkPeselIsValid(String pesel) {
        assertTrue(PeselValidator.checkPesel(pesel));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "7777777777a", "abababababa", "111111 1111", "123456789012"})
    void checkPeselIsNotValid(String pesel) {
        assertFalse(PeselValidator.checkPesel(pesel));
    }


}