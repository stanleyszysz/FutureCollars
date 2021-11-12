package future.collars.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubtractTest {
    @Test
    void shouldSubtractTwoNumbers_MinusOneAndMinusNine() {
        double numberOne = -1.0;
        double numberTwo = -9.0;
        Subtract subtract = new Subtract(numberOne, numberTwo);

        double result = subtract.getResult();

        Assertions.assertEquals(8.0, result);
    }
}