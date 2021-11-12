package future.collars.calculator;

class Sum extends Calculator {
    private final double numberOne, numberTwo;

    public Sum(double numberOne, double numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    @Override
    public double getResult() {
        return numberOne + numberTwo;
    }
}
