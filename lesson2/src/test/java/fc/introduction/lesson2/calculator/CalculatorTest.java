package fc.introduction.lesson2.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void shouldAddTwoNumbers_ZeroAndNine() {
        Calculator calculator = new Calculator();
        double value1 = 0;
        double value2 = 9;

        double sum = calculator.sum(value1, value2);

        Assertions.assertEquals(9, sum);
    }

    @Test
    void shouldSubtractTwoNumbers_ZeroAndNine() {
        Calculator calculator = new Calculator();
        double value1 = 0;
        double value2 = 9;

        double subtract = calculator.subtract(value1, value2);

        Assertions.assertEquals(-9, subtract);
    }

    @Test
    void shouldMultiplyTwoNumbers_FourAndZero() {
        Calculator calculator = new Calculator();
        double value1 = 4;
        double value2 = 0;

        double multiply = calculator.multiply(value1, value2);

        Assertions.assertEquals(0, multiply);
    }

    @Test
    void shouldDivideTwoNumbers_FourAndTwo() {
        Calculator calculator = new Calculator();
        double value1 = 4;
        double value2 = 2;

        double divide = calculator.divide(value1, value2);

        Assertions.assertEquals(2, divide);
    }

    @Test
    void shouldDivideTwoNumbers_FourAndZero() {
        Calculator calculator = new Calculator();
        double value1 = 4;
        double value2 = 0;

        Assertions.assertThrows(RuntimeException.class, () -> {
            calculator.divide(value1, value2);
        });
    }

}