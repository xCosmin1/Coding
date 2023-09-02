package designpattern.behavioral.memento;

public class MementoMain {
    public static void main(String[] args) {

        TextEditor notepad = new TextEditor();

        notepad.write("ala bala portocala");
        notepad.showWrittenText();

        notepad.pressSave();

        notepad.write("Azi e duminica");
        notepad.showWrittenText();

        notepad.pressUndo();
        notepad.showWrittenText();


    }
}
