package fc.introduction.triangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static fc.introduction.triangle.RightTriangle.isRightTriangle;
import static org.junit.jupiter.api.Assertions.*;

class RightTriangleTest {

    @Test
    void shouldNotBeRightTriangle_SidesTwoSevenAndNine() {
        int a = 2;
        int b = 7;
        int c = 9;

        assertFalse(isRightTriangle(a, b, c));

    }

    @Test
    void shouldBeRightTriangle_SidesThreeFourAndFive() {
        int a = 3;
        int b = 4;
        int c = 5;

        assertTrue(isRightTriangle(a, b, c));

    }

    @Test
    void shouldNotBeTriangle_SidesZeroOneAndFive() {
        int a = 0;
        int b = 1;
        int c = 5;

        Assertions.assertThrows(RuntimeException.class, () -> {
            isRightTriangle(a, b, c);
        });

    }
}