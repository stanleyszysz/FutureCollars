package fc.introduction.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CircleTest {

    @Test
    void shouldCalculateArea_RadiusOne() {
        double radius = 1.0;
        Circle circle = new Circle(radius);

        double circleArea = circle.getArea();

        Assertions.assertEquals(Math.PI, circleArea);
    }

    @Test
    void shouldReturnException_RadiusZero() {
        double radius = 0.0;
        Circle circle = new Circle(radius);

        Assertions.assertThrows(RuntimeException.class, () -> {
            circle.getArea();
        });
    }

    @Test
    void shouldCalculatePerimeter_RadiusFivePointFive() {
        double radius = 5.5;
        Circle circle = new Circle(radius);

        double circlePerimeter = circle.getPerimeter();

        Assertions.assertEquals(2 * Math.PI * 5.5, circlePerimeter);
    }

    @Test
    void shouldReturnException_RadiusMinusEleven() {
        double radius = -11.0;
        Circle circle = new Circle(radius);

        Assertions.assertThrows(RuntimeException.class, () -> {
            circle.getPerimeter();
        });
    }
}