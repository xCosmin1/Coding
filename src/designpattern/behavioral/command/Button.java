package designpattern.behavioral.command;

public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;

    }

    public void press(){
        command.execute();
    }
}
