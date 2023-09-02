package designpattern.behavioral.command;

public class CommandMain {
    public static void main(String[] args) {

        Television samsungTv = new Television();

        Button on = new Button( new TurnOnCommand(samsungTv));
        Button off = new Button( new TurnOffCommand(samsungTv));

        on.press();
        off.press();



    }

}
