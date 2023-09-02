package designpattern.behavioral.template;

public class VeggieSandwich extends Sandwich{



    @Override
    void addMeat() {

    }

    @Override
    void addCheese() {

    }

    @Override
    void addVegetables() {
        System.out.println("Adaug castraveti, rosii, salata ");
    }

    @Override
    protected boolean customerWantsMeat() {
        return false;
    }
}
