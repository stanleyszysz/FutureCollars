package fc.regex.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Numbers {

    public static boolean checkInteger(String number) {
        Pattern pattern = Pattern.compile("-?\\d+$");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

    public static boolean checkFloating(String number) {
        Pattern pattern = Pattern.compile("-?\\d+\\.\\d+");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

    public static boolean checkScientific(String number) {
        Pattern pattern = Pattern.compile("-?\\d+\\.\\d+[eE][+-]\\d{2}");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

    public void fileReader() throws IOException {

        BufferedReader reader = Files.newBufferedReader(Paths.get("src/main/resources/numbers"));
        String line;
        while ((line = reader.readLine()) != null) {
            if (checkInteger(line)) {
                System.out.println(line + " is integer.");
            } else if (checkFloating(line)) {
                System.out.println(line + " is floating.");
            } else if (checkScientific(line)) {
                System.out.println(line + " is scientific.");
            }
            else System.out.println("Not a number.");
        }
    }
}
