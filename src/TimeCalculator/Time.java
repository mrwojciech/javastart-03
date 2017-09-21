package TimeCalculator;

public class Time {

    int day;
    int hour;
    int minute;
    int second;

    public Time(int day, int hour, int minute, int second) {
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time() {
    }


    public int toSeconds(int day, int hour, int minute, int second) {
        return ((day * 24 + hour) * 60 + minute) * 60 + second;
    }

    public int toHours(int day, int hour, int minute, int second) {
        return toSeconds(day, hour, minute, second) / 3600;
    }

    public int toMinutes(int day, int hour, int minute, int second) {
        return toSeconds(day, hour, minute, second) / 60;
    }
}
