package future.collars.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubtractTest {
    @Test
    void shouldSubtractTwoNumbers_MinusOneAndMinusNine() {
        double numberOne = -1.0;
        double numberTwo = -9.0;
        Calculator calculator = new Calculator();

        double result = calculator.subtraction(numberOne, numberTwo);

        Assertions.assertEquals(8.0, result);
    }
}