package future.collars.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DivideTest {
    @Test
    void shouldDivideTwoNumbers_FiveAndTwo() {
        double numberOne = 5.0;
        double numberTwo = 2.0;
        Divide divide = new Divide(numberOne, numberTwo);

        double result = divide.getResult();

        Assertions.assertEquals(2.5, result);
    }

    @Test
    void shouldReturnException_ForNumbersFiveAndZero() {
        double numberOne = 5.0;
        double numberTwo = 0.0;
        Divide divide = new Divide(numberOne, numberTwo);

        Assertions.assertThrows(RuntimeException.class, () -> {
            divide.getResult();
        });
    }

}