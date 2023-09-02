package designpattern.structural.adapter;

public class ScannerAsAdapter implements Reader{

    private Paper paper;

    @Override
    public String read() {
        return paper.getText();
    }

    public ScannerAsAdapter(Paper paper) {
        this.paper = paper;
    }
}
