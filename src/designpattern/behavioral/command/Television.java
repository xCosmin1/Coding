package designpattern.behavioral.command;

public class Television implements ElectronicDevice{




    @Override
    public void turnOn() {
        System.out.println("Tv is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv is turning off");
    }
}
