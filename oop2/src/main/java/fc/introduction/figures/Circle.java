package fc.introduction.figures;

public class Circle implements Figure{
    private final double circleRadius;
    final double PI = Math.PI;

    public Circle(double radius) {
        this.circleRadius = radius;
    }

    @Override
    public double getArea() {
        if (circleRadius <= 0) {
            throw new RuntimeException();
        }
        else {
            return PI * Math.pow(circleRadius, 2);
        }
    }

    @Override
    public double getPerimeter() {
        if (circleRadius <= 0) {
            throw new RuntimeException();
        }
        else {
            return 2 * PI * circleRadius;
        }
    }
}
