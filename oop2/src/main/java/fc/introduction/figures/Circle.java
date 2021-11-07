package fc.introduction.figures;

public class Circle implements Figure{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        if (radius <= 0) {
            throw new RuntimeException();
        }
            return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        if (radius <= 0) {
            throw new RuntimeException();
        }
            return 2 * Math.PI * radius;
    }
}
