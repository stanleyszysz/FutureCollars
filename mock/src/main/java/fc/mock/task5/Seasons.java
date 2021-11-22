package fc.mock.task5;

import java.time.Month;

public enum Seasons {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER;

    static public Seasons of(final Month month) {
        switch (month) {

            case JANUARY:

            case FEBRUARY:

            case DECEMBER:
                return Seasons.WINTER;

            case MARCH:

            case APRIL:

            case MAY:
                return Seasons.SPRING;

            case JUNE:

            case JULY:

            case AUGUST:
                return Seasons.SUMMER;

            case SEPTEMBER:

            case OCTOBER:

            case NOVEMBER:
                return Seasons.AUTUMN;

            default:
                return null;
        }
    }
}
