package future.collars.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MultiplyTest {
    @Test
    void shouldMultiplyTwoNumbers_ZeroAndFour() {
        double numberOne = 0.0;
        double numberTwo = 4.0;
        Multiply multiply = new Multiply(numberOne, numberTwo);

        double result = multiply.getResult();

        Assertions.assertEquals(0.0, result);
    }

}