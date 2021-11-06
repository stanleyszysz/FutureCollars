package fc.introduction.shapes;

class Rectangle extends Square{
    private final double height;

    public Rectangle(double width, double height) {
        super(width);
        this.height = height;
    }

    @Override
    public double getArea() {
        if (getWidth() <= 0 || height <= 0) {
            throw new RuntimeException();
        }
        else {
            return getWidth() * height;
        }
    }

    @Override
    public double getPerimeter() {
        if (getWidth() <= 0 || height <= 0) {
            throw new RuntimeException();
        }
        else {
            return 2 * getWidth() + 2 * height;
        }
    }
}
