package fc.introduction.shapes;

class Square extends Shape{
    private final double width;

    public Square(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        if (width <= 0) {
            throw new RuntimeException();
        }
        else {
            return width * width;
        }
    }

    @Override
    public double getPerimeter() {
        if (width <= 0) {
            throw new RuntimeException();
        }
        else {
            return 4 * width;
        }
    }
}
