package future.collars.calculator;

class Subtract implements Operation {

    @Override
    public double calculate(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }
}
