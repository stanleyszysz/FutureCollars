package fc.introduction.lesson2.evenAndOdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;

class EvenAndOddTest {

    @Test
    void checkIsEvenOneHundred() {
        EvenAndOdd evenAndOdd = new EvenAndOdd();
        int number = 100;

        boolean result = evenAndOdd.even(number);

        Assertions.assertTrue(result);
    }

    @Test
    void checkIsEven_MinusNineteen() {
        EvenAndOdd evenAndOdd = new EvenAndOdd();
        int number = -19;

        boolean result = evenAndOdd.even(number);

        Assertions.assertFalse(result);
    }

    @Test
    void checkIsEven_Three() {
        EvenAndOdd evenAndOdd = new EvenAndOdd();
        int number = 3;

        boolean result = evenAndOdd.even(number);

        Assertions.assertFalse(result);
    }

    @Test
    void checkIsOdd_MinusTwenty() {
        EvenAndOdd evenAndOdd = new EvenAndOdd();
        int number = -20;

        boolean result = evenAndOdd.even(number);

        Assertions.assertTrue(result);
    }

    @Test
    void checkIsOdd_Zero() {
        EvenAndOdd evenAndOdd = new EvenAndOdd();
        int number = 0;

        boolean result = evenAndOdd.even(number);

        Assertions.assertTrue(result);
    }
}