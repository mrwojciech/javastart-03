package Televisior;

public class Television {
    status tvStatus;

    enum status {
        ON, OFF;
    }


    void turnOn() {
        this.tvStatus = status.ON;
    }

    void turnOff() {
        this.tvStatus = status.OFF;
    }


    void showStatus() {
        System.out.println("The tv is: " + tvStatus.toString());
    }
}
