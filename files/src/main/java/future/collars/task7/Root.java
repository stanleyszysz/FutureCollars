package future.collars.task7;

class Root {

    public static double takeTheRoot(double number) {

        if (number >= 0) {
            return Math.pow(number, 0.5);
        }
        throw new IllegalArgumentException("Division by zero isn't allowed.");
    }

}
