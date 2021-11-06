package fc.introduction.formatter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class AllCapsTest {

    @Test
    void shouldChangeToAllCaps() {
        String text = "Java Programming Is Fun.";
        AllCaps allCaps = new AllCaps();

        String changedText = allCaps.formatText(text);

        Assertions.assertEquals("JAVA PROGRAMMING IS FUN.", changedText);
    }

    @Test
    void shouldNotChangeText() {
        String text = "JAVA PROGRAMMING IS FUN.";
        AllCaps allCaps = new AllCaps();

        String changedText = allCaps.formatText(text);

        Assertions.assertEquals("JAVA PROGRAMMING IS FUN.", changedText);
    }
}