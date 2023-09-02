package designpattern.structural.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        Paper paper = new Paper("Azi avem curs de Design pattern");
        PC pc =new PC();
        ScannerAsAdapter scanner = new ScannerAsAdapter(paper);
        pc.readTextInPdfFormat(scanner);

        System.out.println(pc.getDigitalText());

    }
}
