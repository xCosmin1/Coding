package designpattern.structural.adapter;

public class PC {
    private String digitalText;

    public String getDigitalText() {
        return digitalText;
    }

    public void readTextInPdfFormat(Reader reader) {
        digitalText = reader.read();
    }
}
