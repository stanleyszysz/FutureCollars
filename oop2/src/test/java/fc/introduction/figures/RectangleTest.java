package fc.introduction.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RectangleTest {

    @Test
    void shouldCalculateArea_WidthFourHeightFour() {
        double width = 4.0;
        double height = 4.0;
        Rectangle rectangle = new Rectangle(width, height);

        double rectangleArea = rectangle.getArea();

        Assertions.assertEquals(16.0, rectangleArea);
    }

    @Test
    void shouldReturnException_WidthZeroHeightFive() {
        double width = 0.0;
        double height = 5.0;
        Rectangle rectangle = new Rectangle(width, height);

        Assertions.assertThrows(RuntimeException.class, () -> {
            rectangle.getArea();
        });
    }

    @Test
    void shouldCalculatePerimeter_WidthElevenHeightTwelve() {
        double width = 11.0;
        double height = 12.0;
        Rectangle rectangle = new Rectangle(width, height);

        double rectanglePerimeter = rectangle.getPerimeter();

        Assertions.assertEquals(46.0, rectanglePerimeter);
    }

    @Test
    void shouldReturnException_WidthThreeHeightMinusTwo() {
        double width = 3.0;
        double height = -2.0;
        Rectangle rectangle = new Rectangle(width, height);

        Assertions.assertThrows(RuntimeException.class, () -> {
            rectangle.getPerimeter();
        });
    }
}