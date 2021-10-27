package fc.introduction.lesson2.calculator;

public class Calculator {

    public double sum(double numberOne, double numberTwo) {
        double result = numberOne + numberTwo;
        return result;
    }

    public double subtract(double numberOne, double numberTwo) {
        double result = numberOne - numberTwo;
        return result;
    }

    public double multiply(double numberOne, double numberTwo) {
        double result = numberOne * numberTwo;
        return result;
    }

    public double divide(double numberOne, double numberTwo) {
        if (numberTwo == 0) {
            System.out.println("Błędna wartość!");
            throw new RuntimeException();
        }
        else {
            double result = numberOne / numberTwo;
            return result;
        }
    }

}
