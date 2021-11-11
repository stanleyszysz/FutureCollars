package future.collars.fizzbuzz;

class FizzBuzz {
    private final int minValue, maxValue;

    public FizzBuzz(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public void calculateIfFizzBuzz() {
        for (int i = minValue; i <= maxValue; i ++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else System.out.println(i);
        }
    }
}
