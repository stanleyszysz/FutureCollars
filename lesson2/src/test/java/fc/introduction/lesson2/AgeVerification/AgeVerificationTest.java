package fc.introduction.lesson2.AgeVerification;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class AgeVerificationTest {

    @Test
    void checkYourAgeEighteen() {
        AgeVerification ageVerification = new AgeVerification();
        int value = 18;

        String message = ageVerification.age(value);

        Assertions.assertEquals("Adult", message);
    }

    @Test
    void checkYourAgeNine() {
        AgeVerification ageVerification = new AgeVerification();
        int value = 9;

        String message = ageVerification.age(value);

        Assertions.assertEquals("Kid", message);
    }

    @Test
    void checkYourAgeZero() {
        AgeVerification ageVerification = new AgeVerification();
        int value = 0;

        String message = ageVerification.age(value);

        Assertions.assertEquals("Error", message);
    }

    @Test
    void checkYourAgeOneHundredFifty() {
        AgeVerification ageVerification = new AgeVerification();
        int value = 150;

        String message = ageVerification.age(value);

        Assertions.assertEquals("Error", message);
    }

    @Test
    void checkYourAgeMinusFive() {
        AgeVerification ageVerification = new AgeVerification();
        int value = -5;

        String message = ageVerification.age(value);

        Assertions.assertEquals("Error", message);
    }

}