package future.collars.calculator;

class Divide extends Operation {

    @Override
    public double calculate(double numberOne, double numberTwo) {
        if (numberTwo != 0) {
            return numberOne / numberTwo;
        }
        throw new RuntimeException();
    }
}
