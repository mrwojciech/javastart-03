package TimeCalculator;

public class TimeCalculatorTest {

    public static void main(String[] args) {

        Day day = new Day(1);
        Hour hour = new Hour(1);
        Minute minute = new Minute(1);
        Second sec = new Second(1);
        Second sec3 = new Second(120);

        TimeCalculator timeCalculator = new TimeCalculator();

        timeCalculator.changeAndShowAndReturnDaysIntoHours(day);
        timeCalculator.changeAndShowAndReturnDaysHoursMinutesSecoundsIntoSecounds(day, hour, minute, sec);
        timeCalculator.changeAndReturnSecoundToMinutes(360);
        timeCalculator.changeAndReturnSecoundToMinutes(sec3);
    }
}
