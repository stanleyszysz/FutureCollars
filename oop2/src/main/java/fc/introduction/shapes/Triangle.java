package fc.introduction.shapes;

import java.util.Arrays;

class Triangle extends Shape {
    private final double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

        boolean isAnySideLessThanZero = sideA <= 0 || sideB <= 0 || sideC <= 0;

        double[] arraySides = {sideA, sideB, sideC};
        Arrays.sort(arraySides);

        boolean isSumTwoSidesLessThanLongestSide = arraySides[0] + arraySides[1] <= arraySides[2];

        if (isAnySideLessThanZero || isSumTwoSidesLessThanLongestSide) throw new RuntimeException();
    }

    @Override
    public double getArea() {
        double halfPerimeterTriangle = (sideA + sideB + sideC) / 2;
        return Math.sqrt(halfPerimeterTriangle * (halfPerimeterTriangle - sideA) * (halfPerimeterTriangle - sideB) * (halfPerimeterTriangle - sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
