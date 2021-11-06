package fc.introduction.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void shouldCalculateArea_SidesTwoFourFive() {
        double sideA = 2.0;
        double sideB = 4.0;
        double sideC = 5.0;
        Shape triangle = new Triangle(sideA, sideB, sideC);

        double triangleArea = triangle.getArea();

        Assertions.assertEquals(Math.sqrt(14.4375), triangleArea);
    }

    @Test
    void shouldReturnException_SidesTwoFourSix() {
        double sideA = 2.0;
        double sideB = 4.0;
        double sideC = 6.0;
        Shape triangle = new Triangle(sideA, sideB, sideC);

        Assertions.assertThrows(RuntimeException.class, () -> {
            triangle.getArea();
        });
    }

    @Test
    void shouldCalculatePerimeter_SidesSixSevenEight() {
        double sideA = 6.0;
        double sideB = 7.0;
        double sideC = 8.0;
        Shape triangle = new Triangle(sideA, sideB, sideC);

        double trianglePerimeter = triangle.getPerimeter();

        Assertions.assertEquals(21, trianglePerimeter);
    }

    @Test
    void shouldReturnException_SidesOneTwoZero() {
        double sideA = 1.0;
        double sideB = 2.0;
        double sideC = 0.0;
        Shape triangle = new Triangle(sideA, sideB, sideC);

        Assertions.assertThrows(RuntimeException.class, () -> {
            triangle.getPerimeter();
        });
    }
}