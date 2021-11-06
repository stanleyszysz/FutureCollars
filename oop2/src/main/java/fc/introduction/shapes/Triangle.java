package fc.introduction.shapes;

class Triangle extends Shape{
    private final double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        if ((sideA <= 0 || sideB <= 0 || sideC <= 0) || (sideA + sideB <= sideC)){
            throw new RuntimeException();
        }
        else {
            double halfPerimeterTriangle = (sideA + sideB + sideC) / 2;
            return Math.sqrt(halfPerimeterTriangle * (halfPerimeterTriangle - sideA) * (halfPerimeterTriangle - sideB) * (halfPerimeterTriangle - sideC));
        }
    }

    @Override
    public double getPerimeter() {
        if ((sideA <= 0 || sideB <= 0 || sideC <= 0) || (sideA + sideB <= sideC)) {
            throw new RuntimeException();
        }
        else {
            return sideA + sideB + sideC;
        }

    }
}
