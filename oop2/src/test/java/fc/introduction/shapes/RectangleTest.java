package fc.introduction.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RectangleTest {

    @Test
    void shouldCalculateArea_WidthTwoHeightFour() {
        double width = 2.0;
        double height = 4.0;
        Square rectangle = new Rectangle(width, height);

        double rectangleArea = rectangle.getArea();

        Assertions.assertEquals(8.0, rectangleArea);
    }

    @Test
    void shouldCalculateArea_WidthFiveHeightSeven() {
        double width = 5.0;
        double height = 7.0;
        Square rectangle = new Rectangle(width, height);

        double rectanglePerimeter = rectangle.getPerimeter();

        Assertions.assertEquals(24.0, rectanglePerimeter);
    }

    @Test
    void shouldReturnException_WidthZeroHeightNine() {
        double width = 0.0;
        double height = 9.0;

        Assertions.assertThrows(RuntimeException.class, () -> {
            Square rectangle = new Rectangle(width, height);
        });
    }

    @Test
    void shouldReturnException_WidthThreeHeightMinusTwo() {
        double width = 3.0;
        double height = -2.0;

        Assertions.assertThrows(RuntimeException.class, () -> {
            Square rectangle = new Rectangle(width, height);
        });
    }

}