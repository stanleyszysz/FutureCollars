package fc.introduction.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CircleTest {

    @Test
    void shouldCalculateArea_RadiusFive() {
        double circleRadius = 5.0;
        Shape circle = new Circle(circleRadius);

        double circleArea = circle.getArea();

        Assertions.assertEquals(Math.PI * 5 * 5, circleArea);
    }

    @Test
    void shouldCalculatePerimeter_RadiusTen() {
        double circleRadius = 10.0;
        Shape circle = new Circle(circleRadius);

        double circlePerimeter = circle.getPerimeter();

        Assertions.assertEquals(2 * Math.PI * 10, circlePerimeter);
    }

    @Test
    void shouldReturnException_RadiusZero() {
        double radius = 0.0;

        Assertions.assertThrows(RuntimeException.class, () -> {
            Shape circle = new Circle(radius);
        });
    }

    @Test
    void shouldReturnException_RadiusMinusTwo() {
        double radius = -2.0;

        Assertions.assertThrows(RuntimeException.class, () -> {
            Shape circle = new Circle(radius);
        });
    }
}