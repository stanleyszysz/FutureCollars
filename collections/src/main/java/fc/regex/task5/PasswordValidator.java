package fc.regex.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static boolean checkPassword(String password) {
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[A-Z])(?!.*?(?:2021|21)).{7,}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
