package fc.regex.task6;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class BirthDate {

    public static void main(String[] args) {

        String birthDate = "1995-08-02";
        LocalDate dateParsed = parseDate(birthDate);

        System.out.println(computeAge(dateParsed) + " " + computeDayOfWeek(dateParsed) + " " + weekOfYear(dateParsed));
    }

    private static LocalDate parseDate(String birthDate) {
        return LocalDate.parse(birthDate);
    }

    private static DayOfWeek computeDayOfWeek(LocalDate date) {
        return date.getDayOfWeek();
    }

    private static int weekOfYear(LocalDate date) {
        return (date.getDayOfYear() / 7) + 1;
    }

    private static int computeAge(LocalDate date) {
        LocalDate dateNow = LocalDate.now();
        return dateNow.getYear() - date.getYear();
    }

}
