package fc.introduction.shapes;

class Square extends Shape {
    protected final double width;

    public Square(double width) {
        this.width = width;
        if (width <= 0) throw new RuntimeException();
    }

    @Override
    public double getArea() {
        return width * width;
    }

    @Override
    public double getPerimeter() {
        return 4 * width;
    }
}
