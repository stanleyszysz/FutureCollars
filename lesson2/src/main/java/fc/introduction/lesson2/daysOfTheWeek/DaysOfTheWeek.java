package fc.introduction.lesson2.daysOfTheWeek;

public class DaysOfTheWeek {

    public String nameOfTheDay(int number) {

        String day;

        switch (number) {
            case 1: day = "Monday"; break;
            case 2: day = "Tuesday"; break;
            case 3: day = "Wednesday"; break;
            case 4: day = "Thursday"; break;
            case 5: day = "Friday"; break;
            case 6: day = "Weekend"; break;
            case 7: day = "Weekend"; break;
            default: day = "There is no such a day!";
        }
        return day;
    }
}
