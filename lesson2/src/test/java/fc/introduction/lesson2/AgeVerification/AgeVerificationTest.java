package fc.introduction.lesson2.AgeVerification;

import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeVerificationTest {

    @Test
    void checkYourAgeEighteen() {
        AgeVerification ageVerification = new AgeVerification();
        int value = 18;

        boolean age = ageVerification.age(value);

        Assertions.assertEquals(true, age);
    }

    @Test
    void checkYourAgeEleven() {
        AgeVerification ageVerification = new AgeVerification();
        int value = 11;

        boolean age = ageVerification.age(value);

        Assertions.assertEquals(false, age);
    }

}