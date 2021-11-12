package future.collars.calculator;

class Subtract extends Calculator {
    private final double numberOne, numberTwo;

    public Subtract(double numberOne, double numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    @Override
    public double getResult() {
        return numberOne - numberTwo;
    }
}
