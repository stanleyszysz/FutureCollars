package future.collars.calculator;

class Multiply extends Calculator {
    private final double numberOne, numberTwo;

    public Multiply(double numberOne, double numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    @Override
    public double getResult() {
        return numberOne * numberTwo;
    }
}
