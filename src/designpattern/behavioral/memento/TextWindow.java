package designpattern.behavioral.memento;

public class TextWindow {

    private StringBuilder currentText;

    public TextWindow() {
        this.currentText = new StringBuilder();
    }

    public void addText(String newText){
        currentText.append(newText);
    }

    public StringBuilder getCurrentText() {
        return currentText;
    }

    public TextWindowState save(){
        return new TextWindowState(currentText.toString());
    }
    public void restore(TextWindowState savedState){
        currentText = new StringBuilder(savedState.getText());
    }
}
