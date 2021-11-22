package fc.mock.test4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TextLengthTest {

    private static Stream<Arguments> provideStringsForGetTextLength() {
        return Stream.of(
                Arguments.of("Java", 4),
                Arguments.of("Introduction to Java", 20),
                Arguments.of("", 0),
                Arguments.of("5 x 5", 5)
        );
    }

    @ParameterizedTest
    @MethodSource("provideStringsForGetTextLength")
    void shouldReturnTextLength(String text, int lengthExpected) {
        assertEquals(lengthExpected, TextLength.getTextLength(text));
    }
}