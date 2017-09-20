package Televisior;

public class Television {

    boolean status;


    void turnOn() {
        this.status = true;
    }

    void turnOff() {
        this.status = false;
    }


    void showStatus() {
        String tvStatus = (status == true) ? "ON" : "OFF";

        System.out.println("The tv is: " + tvStatus);
    }
}
