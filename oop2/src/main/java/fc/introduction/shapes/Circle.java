package fc.introduction.shapes;

class Circle extends Shape {
    private final double circleRadius;
    final double PI = Math.PI;


    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
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
