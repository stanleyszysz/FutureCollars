package fc.introduction.days;

class Days {

    public static void main(String[] args) {
        DayName dayName = DayName.SUNDAY;
        String day = getDayName(dayName);
        System.out.println(day);

    }

    public static String getDayName(DayName dayName) {
        return dayName.toString();
    }

}
