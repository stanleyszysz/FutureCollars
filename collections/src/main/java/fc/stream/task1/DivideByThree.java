package fc.stream.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DivideByThree {

    public static List<Integer> integersDivisibleByThree(int lowerBound, int upperBound) {
        if (lowerBound > upperBound) {
            return new ArrayList<>();
        }
        return IntStream.range(lowerBound, upperBound)
                .filter(number -> number % 3 == 0)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> filteredNumbers = integersDivisibleByThree(0, 100);
        System.out.println(filteredNumbers);
    }
}