package future.collars.calculator;

class Multiply implements Operation {

    @Override
    public double calculate(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }
}
