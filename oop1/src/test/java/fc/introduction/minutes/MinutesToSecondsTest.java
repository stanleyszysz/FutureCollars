package fc.introduction.minutes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static fc.introduction.minutes.MinutesToSeconds.convertMinutesToSeconds;

//import static org.junit.jupiter.api.Assertions.*;

class MinutesToSecondsTest {

    @Test
    void convertZeroMinutesToSeconds() {

        Assertions.assertEquals(0, convertMinutesToSeconds(0));
    }

    @Test
    void convertFifteenMinutesToSeconds() {

        Assertions.assertEquals(900, convertMinutesToSeconds(15));
    }

    @Test
    void convertMinusFiveMinutesToSeconds() {

        Assertions.assertThrows(RuntimeException.class, () -> {
            convertMinutesToSeconds(-5);
        });
    }
}