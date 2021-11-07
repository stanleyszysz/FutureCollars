package fc.introduction.shapes;

class Square extends Shape{
    protected final double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        if (width <= 0) {
            throw new RuntimeException();
        }
            return width * width;
    }

    @Override
    public double getPerimeter() {
        if (width <= 0) {
            throw new RuntimeException();
        }
            return 4 * width;
    }
}
