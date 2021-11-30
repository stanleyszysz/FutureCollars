package fc.mock.task7;

public class RatingCalculator {

    private final TrainingResult trainingResult;

    public RatingCalculator(TrainingResult trainingResult) {
        this.trainingResult = trainingResult;
    }

    public Rating calculate(int trainingLengthParameter, int caloriesBurnedParameter, int pulseParameter) {

        int lengthRating = trainingResult.calculateLengthParameter(trainingLengthParameter);
        int burnedRating = trainingResult.calculateBurnedParameter(caloriesBurnedParameter);
        int pulseRating = trainingResult.calculatePulseParameter(pulseParameter);

        if (lengthRating == ErrorCode.USER_INPUT_ERROR || burnedRating == ErrorCode.USER_INPUT_ERROR || pulseRating == ErrorCode.USER_INPUT_ERROR) {
            return Rating.ERROR;
        }

        double rating = WeightedAverage.calculateWeightedAverage(lengthRating, burnedRating,
                pulseRating);
        return RatingAssignment.getRating(rating);
    }
}
