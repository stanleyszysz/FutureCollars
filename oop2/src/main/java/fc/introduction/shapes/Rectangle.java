package fc.introduction.shapes;

class Rectangle extends Square{
    private final double height;

    public Rectangle(double width, double height) {
        super(width);
        this.height = height;
    }

    @Override
    public double getArea() {
        if (width <= 0 || height <= 0) {
            throw new RuntimeException();
        }
            return width * height;
    }

    @Override
    public double getPerimeter() {
        if (width <= 0 || height <= 0) {
            throw new RuntimeException();
        }
            return 2 * width + 2 * height;
    }
}
