package TimeCalculator;

public class Hour {

    private int number;

    public Hour(Day day) {
        this.number = day.getDays() * 24;
    }

    public Hour(int number) {
        this.number = number;
    }

    Minute convertToMinutes() {
        return new Minute(this);
    }

    int getHours() {
        return this.number;
    }

}
