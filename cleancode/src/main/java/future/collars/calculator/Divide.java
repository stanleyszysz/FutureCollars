package future.collars.calculator;

class Divide extends Calculator {
    private final double numberOne, numberTwo;

    public Divide(double numberOne, double numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    @Override
    public double getResult() {
        if (numberTwo != 0) {
            return numberOne / numberTwo;
        }
        throw new RuntimeException();
    }
}
