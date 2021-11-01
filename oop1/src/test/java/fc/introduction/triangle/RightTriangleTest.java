package fc.introduction.triangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static fc.introduction.triangle.RightTriangle.triangle;
import static org.junit.jupiter.api.Assertions.*;

class RightTriangleTest {

    @Test
    void checkIfRightTriangle_SidesTwoSevenAndNine() {
        int a = 2;
        int b = 7;
        int c = 9;

        assertFalse(triangle(a, b, c));

    }

    @Test
    void checkIfRightTriangle_SidesThreeFourAndFive() {
        int a = 3;
        int b = 4;
        int c = 5;

        assertTrue(triangle(a, b, c));

    }

    @Test
    void checkIfRightTriangle_SidesZeroOneAndFive() {
        int a = 0;
        int b = 1;
        int c = 5;

        Assertions.assertThrows(RuntimeException.class, () -> {
            triangle(a, b, c);
        });

    }
}