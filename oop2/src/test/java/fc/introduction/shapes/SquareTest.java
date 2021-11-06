package fc.introduction.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void shouldCalculateArea_WidthTwo() {
        double width = 2.0;
        Shape square = new Square(width);

        double squareArea = square.getArea();

        Assertions.assertEquals(4, squareArea);
    }

    @Test
    void shouldReturnException_WidthZero() {
        double width = 0.0;
        Shape square = new Square(width);

        Assertions.assertThrows(RuntimeException.class, () -> {
            square.getArea();
        });
    }

        @Test
        void shouldCalculatePerimeter_WidthSeven() {
            double width = 7.0;
            Shape square = new Square(width);

            double squarePerimeter = square.getPerimeter();

            Assertions.assertEquals(28, squarePerimeter);
        }

        @Test
        void shouldReturnException_WidthMinusOne() {
            double width = -1.0;
            Shape square = new Square(width);

            Assertions.assertThrows(RuntimeException.class, () -> {
                square.getPerimeter();
            });
        }
}