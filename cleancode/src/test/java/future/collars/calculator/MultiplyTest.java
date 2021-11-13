package future.collars.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MultiplyTest {
    @Test
    void shouldMultiplyTwoNumbers_ZeroAndFour() {
        double numberOne = 0.0;
        double numberTwo = 4.0;
        Calculator calculator = new Calculator();

        double result = calculator.multiplication(numberOne, numberTwo);

        Assertions.assertEquals(0.0, result);
    }

}