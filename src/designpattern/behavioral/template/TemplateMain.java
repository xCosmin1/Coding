package designpattern.behavioral.template;

public class TemplateMain {
    public static void main(String[] args) {

        Sandwich italian = new ItalianSandwich();
        Sandwich veggie = new VeggieSandwich();

        italian.makeSandwich();
        System.out.println("-----------------------------------------------------------------------------");
        veggie.makeSandwich();


    }
}
