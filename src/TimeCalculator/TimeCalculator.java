package TimeCalculator;

public class TimeCalculator {


    int changeAndShowAndReturnDaysIntoHours(Day day) {
        System.out.println(day.convertToHours().getHours());
        return day.convertToHours().getHours();
    }

    int changeAndShowAndReturnDaysHoursMinutesSecoundsIntoSecounds(Day day, Hour hour, Minute minutes, Second sec) {
        int numberOfSec =
                day.convertToHours().convertToMinutes().convertToSec().getNumber() +
                        hour.convertToMinutes().convertToSec().getNumber() +
                        minutes.convertToSec().getNumber() +
                        sec.getNumber();
        System.out.println(numberOfSec);
        return numberOfSec;
    }

    int changeAndReturnSecoundToMinutes(Second sec) {
        sec.convertToMinutes(sec);
        return changeAndReturnSecoundToMinutes(sec.getNumber());
    }

    public int changeAndReturnSecoundToMinutes(int number) {
        System.out.println(number / 60);
        return number / 60;
    }
}
