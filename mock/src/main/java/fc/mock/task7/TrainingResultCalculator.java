package fc.mock.task7;

public class TrainingResultCalculator implements TrainingResult {


    @Override
    public int calculateLengthParameter(int trainingTime) {

        if (0 > trainingTime || trainingTime > 240) {
            return ErrorCode.USER_INPUT_ERROR;
        }

        if (trainingTime < 30) {
            return 1;
        } else if (trainingTime <= 60) {
            return 2;
        } else {
            return 3;
        }

    }

    @Override
    public int calculateBurnedParameter(int burnedCalories) {

        if (0 > burnedCalories || burnedCalories > 1600) {
            return ErrorCode.USER_INPUT_ERROR;
        }

        if (burnedCalories <= 300) {
            return 1;
        } else if (burnedCalories < 400) {
            return 2;
        } else {
            return 3;
        }
    }

    @Override
    public int calculatePulseParameter(int puls) {

        if (100 > puls || puls > 250) {
            return ErrorCode.USER_INPUT_ERROR;
        }

        if (puls < 160) {
            return 3;
        } else if (puls <= 175) {
            return 2;
        } else {
            return 1;
        }

    }
}
