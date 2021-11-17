package future.collars.calculator;

public class Calculator {
    Sum sum = new Sum();
    Subtract subtract = new Subtract();
    Multiply multiply = new Multiply();
    Divide divide = new Divide();

    public double addition(double numberOne, double numberTwo) {
        return sum.calculate(numberOne, numberTwo);
    }

    public double subtraction(double numberOne, double numberTwo) {
        return subtract.calculate(numberOne, numberTwo);
    }

    public double multiplication(double numberOne, double numberTwo) {
        return multiply.calculate(numberOne, numberTwo);
    }

    public double division(double numberOne, double numberTwo) {
        return divide.calculate(numberOne, numberTwo);
    }
}
