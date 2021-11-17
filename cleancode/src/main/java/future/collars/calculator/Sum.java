package future.collars.calculator;

class Sum implements Operation {
    @Override
    public double calculate(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

}
