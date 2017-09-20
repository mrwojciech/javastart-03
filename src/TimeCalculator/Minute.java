package TimeCalculator;

public class Minute {

    private int number;

    public Minute(int number) {
        this.number = number;
    }

    public Minute(Hour hour) {
        this.number =hour.getHours() * 60;
    }

    public Minute(Second sec) {
        this.number = sec.getNumber()/60;
    }

    public Second convertToSec() {
        return new Second(this);
    }

    int getMinute() {
        return this.number;
    }

}
