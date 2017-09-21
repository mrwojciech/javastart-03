package TimeCalculator;

public class TimeCalculator {


    public static void main(String[] args) {

        TimeCalculator timeCalculator = new TimeCalculator();

        Time time = new Time();
        System.out.println(time.toSeconds(1,1,1,1));
        System.out.println(time.toHours(1,0,0,0));
        System.out.println(time.toMinutes(1,0,0,0));

    }


}