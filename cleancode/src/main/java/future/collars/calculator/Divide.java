package future.collars.calculator;

class Divide implements Operation {

    @Override
    public double calculate(double numberOne, double numberTwo) {
        if (numberTwo != 0) {
            return numberOne / numberTwo;
        }
        throw new RuntimeException();
    }
}
