package fc.introduction.shapes;

class Circle extends Shape {
    private final double circleRadius;

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    @Override
    public double getArea() {
        if (circleRadius <= 0) {
            throw new RuntimeException();
        }
            return Math.PI * Math.pow(circleRadius, 2);
    }

    @Override
    public double getPerimeter() {
        if (circleRadius <= 0) {
            throw new RuntimeException();
        }
            return 2 * Math.PI * circleRadius;
    }
}
