package fc.introduction.minutes;

public class MinutesToSeconds {

    static int convertMinutesToSeconds(int minutes) {
        if (minutes >= 0) {
            return minutes * 60;
        }
        else {
            throw new RuntimeException();
        }
    }
}
