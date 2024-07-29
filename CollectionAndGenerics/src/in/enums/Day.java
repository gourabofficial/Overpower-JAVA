package in.enums;

public enum Day {
    SUNDAY (false),
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false);

    private final boolean isWeekDay;

   public String getType(){
    return isWeekDay ? "Weekday" : "Weekend";
}

    Day(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }
}

