package fc.introduction.shapes;

class Rectangle extends Square {
    private final double height;

    public Rectangle(double width, double height) {
        super(width);
        this.height = height;
        if (height <= 0) throw new RuntimeException();
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }
}
