package designpattern.behavioral.memento;

public class TextEditor {
    private TextWindowState state;
    private TextWindow window;

    public TextEditor() {
        window = new TextWindow();
    }
    public void write(String text){
        window.addText(text);
    }

    public void pressSave(){
       state = window.save();
    }

    public void pressUndo(){
        if(state != null){
            window.restore(state);
        }
    }

    public void showWrittenText(){
        System.out.println(window.getCurrentText());
    }
}
