package fc.introduction.formatter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SmallCapsTest {

    @Test
    void shouldChangeToSmallCaps() {
        String text = "Java Programming Is Fun.";
        SmallCaps smallCaps = new SmallCaps();

        String changedText = smallCaps.formatText(text);

        Assertions.assertEquals("java programming is fun.", changedText);
    }

    @Test
    void shouldNotChangeText() {
        String text = "java programming is fun.";
        SmallCaps smallCaps = new SmallCaps();

        String changedText = smallCaps.formatText(text);

        Assertions.assertEquals("java programming is fun.", changedText);
    }
}