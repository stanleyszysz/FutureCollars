package fc.introduction.figures;

public class Rectangle implements Figure{
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        if (width <= 0 || height <= 0) {
            throw new RuntimeException();
        }
        else {
            return width * height;
        }
    }

    @Override
    public double getPerimeter() {
        if (width <= 0 || height <= 0) {
            throw new RuntimeException();
        }
        else {
            return 2 * width + 2 * height;
        }
    }
}
