package fc.regex.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlValidator {

    public static boolean urlValidator(String url) {
        Pattern pattern = Pattern.compile("(http|https)://(www\\.)?[a-z](.)+[a-z]{2,3}");
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }
}