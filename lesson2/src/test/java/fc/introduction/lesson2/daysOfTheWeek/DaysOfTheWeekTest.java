package fc.introduction.lesson2.daysOfTheWeek;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class DaysOfTheWeekTest {

    @Test
    void getNameOfTheDay_One() {
        DaysOfTheWeek daysOfTheWeek = new DaysOfTheWeek();
        int number = 1;

        String day = daysOfTheWeek.nameOfTheDay(number);

        Assertions.assertEquals("Monday", day);
    }

    @Test
    void getNameOfTheDay_Two() {
        DaysOfTheWeek daysOfTheWeek = new DaysOfTheWeek();
        int number = 2;

        String day = daysOfTheWeek.nameOfTheDay(number);

        Assertions.assertEquals("Tuesday", day);
    }

    @Test
    void getNameOfTheDay_Three() {
        DaysOfTheWeek daysOfTheWeek = new DaysOfTheWeek();
        int number = 3;

        String day = daysOfTheWeek.nameOfTheDay(number);

        Assertions.assertEquals("Wednesday", day);
    }

    @Test
    void getNameOfTheDay_Four() {
        DaysOfTheWeek daysOfTheWeek = new DaysOfTheWeek();
        int number = 4;

        String day = daysOfTheWeek.nameOfTheDay(number);

        Assertions.assertEquals("Thursday", day);
    }

    @Test
    void getNameOfTheDay_Five() {
        DaysOfTheWeek daysOfTheWeek = new DaysOfTheWeek();
        int number = 5;

        String day = daysOfTheWeek.nameOfTheDay(number);

        Assertions.assertEquals("Friday", day);
    }

    @Test
    void getNameOfTheDay_Six() {
        DaysOfTheWeek daysOfTheWeek = new DaysOfTheWeek();
        int number = 6;

        String day = daysOfTheWeek.nameOfTheDay(number);

        Assertions.assertEquals("Weekend", day);
    }

    @Test
    void getNameOfTheDay_Seven() {
        DaysOfTheWeek daysOfTheWeek = new DaysOfTheWeek();
        int number = 7;

        String day = daysOfTheWeek.nameOfTheDay(number);

        Assertions.assertEquals("Weekend", day);
    }

    @Test
    void getNameOfTheDay_Zero() {
        DaysOfTheWeek daysOfTheWeek = new DaysOfTheWeek();
        int number = 0;

        String day = daysOfTheWeek.nameOfTheDay(number);

        Assertions.assertEquals("There is no such a day!", day);
    }
}