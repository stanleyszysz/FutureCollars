package fc.regex.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    private static final Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[A-Z])(?!.*?(?:2021|21)).{7,}$");

    public static boolean checkPassword(String password) {
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
