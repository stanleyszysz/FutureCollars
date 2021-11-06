package fc.introduction.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RectangleTest {

    @Test
    void shouldCalculateArea_WidthTwoFour() {
        double width = 2.0;
        double height = 4.0;
        Square rectangle = new Rectangle(width, height);

        double rectangleArea = rectangle.getArea();

        Assertions.assertEquals(8.0, rectangleArea);
    }

    @Test
    void shouldReturnException_WidthZeroNine() {
        double width = 0.0;
        double height = 9.0;
        Square rectangle = new Rectangle(width, height);

        Assertions.assertThrows(RuntimeException.class, () -> {
            rectangle.getArea();
        });
    }

    @Test
    void shouldCalculateArea_WidthFiveSeven() {
        double width = 5.0;
        double height = 7.0;
        Square rectangle = new Rectangle(width, height);

        double rectanglePerimeter = rectangle.getPerimeter();

        Assertions.assertEquals(24.0, rectanglePerimeter);
    }

    @Test
    void shouldReturnException_WidthThreeMinusTwo() {
        double width = 3.0;
        double height = -2.0;
        Square rectangle = new Rectangle(width, height);

        Assertions.assertThrows(RuntimeException.class, () -> {
            rectangle.getPerimeter();
        });
    }

}