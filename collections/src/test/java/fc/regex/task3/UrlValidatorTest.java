package fc.regex.task3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UrlValidatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"http://www.onet.pl", "https://mail.google.com", "http://wiadmosci.onet.pl", "http://onet.pl"})
    void checkUrlIsValid(String url) {
        assertTrue(UrlValidator.urlValidator(url));
    }

    @ParameterizedTest
    @ValueSource(strings = {"http://.onet.pl", "https:/mail.google.com", "http//wiadmosci.onet.pl", "httpa://onet.pl"})
    void checkUrlIsNotValid(String url) {
        assertFalse(UrlValidator.urlValidator(url));
    }

}