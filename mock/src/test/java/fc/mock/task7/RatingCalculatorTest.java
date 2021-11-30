package fc.mock.task7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RatingCalculatorTest {

    private TrainingResult trainingResult;
    private RatingCalculator ratingCalculator;

    private static Stream<Arguments> provideValueForCalculateRating() {
        return Stream.of(
                Arguments.of(-2, -10, -55, Rating.ERROR),
                Arguments.of(250, 350, 150, Rating.ERROR),
                Arguments.of(60, 1700, 190, Rating.ERROR),
                Arguments.of(60, 400, 90, Rating.ERROR),
                Arguments.of(60, 400, 255, Rating.ERROR),
                Arguments.of(50, 300, 255, Rating.ERROR),
                Arguments.of(30, 400, 175, Rating.VERY_GOOD),
                Arguments.of(60, 300, 180, Rating.SMALL),
                Arguments.of(30, 350, 185, Rating.GOOD),
                Arguments.of(70, 200, 185, Rating.GOOD),
                Arguments.of(30, 400, 160, Rating.VERY_GOOD),
                Arguments.of(30, 200, 150, Rating.VERY_GOOD),
                Arguments.of(30, 400, 175, Rating.VERY_GOOD),
                Arguments.of(70, 290, 160, Rating.GOOD),
                Arguments.of(75, 410, 155, Rating.EXCELLENT)
        );
    }

    @BeforeEach
    void setUp() {

        trainingResult = new TrainingResultCalculator();
        ratingCalculator = new RatingCalculator(trainingResult);

    }

    @ParameterizedTest
    @MethodSource("provideValueForCalculateRating")
    void calculateRating(int trainingLengthParameter, int caloriesBurnedParameter, int pulseParameter,
                         Rating expectedRating) {
        Rating rating = ratingCalculator.calculate(trainingLengthParameter, caloriesBurnedParameter, pulseParameter);
        assertEquals(expectedRating, rating);
    }

}