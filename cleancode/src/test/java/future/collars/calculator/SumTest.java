package future.collars.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SumTest {
    @Test
    void shouldAddTwoNumbers_ThreeAndNine() {
        double numberOne = 3.0;
        double numberTwo = 9.0;
        Sum sum = new Sum(numberOne, numberTwo);

        double result = sum.getResult();

        Assertions.assertEquals(12.0, result);
    }

}