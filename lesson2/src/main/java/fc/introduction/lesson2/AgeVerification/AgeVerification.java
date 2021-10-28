package fc.introduction.lesson2.AgeVerification;

public class AgeVerification {

    final int AGE_OF_THE_OLDEST_MAN = 122;
    String message;

    public String age(int yourAge) {
        if (0 < yourAge && yourAge < 18) {
            message = "Kid";
            return message;
        }

        else if (18 <= yourAge && yourAge <= AGE_OF_THE_OLDEST_MAN) {
            message = "Adult";
            return message;
        }

        else {
            message = "Error";
            return message;
        }
    }

}
