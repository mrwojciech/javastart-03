package TimeCalculator;

public class Second {

    private int number;

    public Second(int number) {
        this.number = number;
    }

    public Second(Minute min) {
        this.number = min.getMinute() * 60;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Minute convertToMinutes(Second sec) {
        return new Minute(sec);
    }
}
