package future.collars.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DivideTest {
    @Test
    void shouldDivideTwoNumbers_FiveAndTwo() {
        double numberOne = 5.0;
        double numberTwo = 2.0;
        Calculator calculator = new Calculator();

        double result = calculator.division(numberOne, numberTwo);

        Assertions.assertEquals(2.5, result);
    }

    @Test
    void shouldReturnException_ForNumbersFiveAndZero() {
        double numberOne = 5.0;
        double numberTwo = 0.0;
        Calculator calculator = new Calculator();

        Assertions.assertThrows(RuntimeException.class, () -> {
            calculator.division(numberOne, numberTwo);
        });
    }

}