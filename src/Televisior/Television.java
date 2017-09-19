package Televisior;

public class Television {
    String status;


    void turnOn() {
        this.status = "ON";
    }

    void turnOff() {
        this.status = "OFF";
    }
    void showStatus(){
        System.out.println("The tv is: "+status);
    }
}
