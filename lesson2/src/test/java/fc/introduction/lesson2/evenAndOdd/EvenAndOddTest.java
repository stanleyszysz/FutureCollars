package fc.introduction.lesson2.evenAndOdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;

class EvenAndOddTest {

    @Test
    void CheckIsEven_OneHundred() {
        EvenAndOdd evenAndOdd = new EvenAndOdd();
        int number = 100;

        boolean result = evenAndOdd.even(number);

        Assertions.assertEquals(true, result);
    }

    @Test
    void CheckIsEven_MinusNineteen() {
        EvenAndOdd evenAndOdd = new EvenAndOdd();
        int number = -19;

        boolean result = evenAndOdd.even(number);

        Assertions.assertEquals(false, result);
    }

    @Test
    void CheckIsOdd_MinusFiftyOne() {
        EvenAndOdd evenAndOdd = new EvenAndOdd();
        int number = -51;

        boolean result = evenAndOdd.odd(number);

        Assertions.assertEquals(true, result);
    }

    @Test
    void CheckIsOdd_Zero() {
        EvenAndOdd evenAndOdd = new EvenAndOdd();
        int number = 0;

        boolean result = evenAndOdd.odd(number);

        Assertions.assertEquals(false, result);
    }
}