package fc.introduction.shapes;

class Circle extends Shape {
    private final double radius;

    public Circle(double circleRadius) {
        this.radius = circleRadius;
        if (radius <= 0) throw new RuntimeException();
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
