package fc.introduction.triangle;

public class RightTriangle {

    static boolean triangle(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0) {
            int sumOfTheSquares = a * a + b * b;
                return c * c == sumOfTheSquares;
            }
        else {
            throw new RuntimeException();
        }
    }
}
