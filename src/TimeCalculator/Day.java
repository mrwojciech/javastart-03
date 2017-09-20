package TimeCalculator;

public class Day {

    private int number;

    public Day(int number) {
        this.number = number;
    }

    public Hour convertToHours() {
        return new Hour(this);
    }

    public int getDays() {
        return this.number;
    }
}
