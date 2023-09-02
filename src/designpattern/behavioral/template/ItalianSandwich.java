package designpattern.behavioral.template;

public class ItalianSandwich extends Sandwich{


    @Override
    void addMeat() {
        System.out.println("Adaug salam italian");

    }

    @Override
    void addCheese() {
        System.out.println("Adaug gorgonzola");
    }

    @Override
    void addVegetables() {
        System.out.println("Adaug rucola");
    }


}
