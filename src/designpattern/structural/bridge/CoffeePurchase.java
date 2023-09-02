package designpattern.structural.bridge;

public class CoffeePurchase implements DrinkPurchase{
    @Override
    public Drink buy(double cost) {
        System.out.println("Cumparam o cafea in valoare de " +cost);
        return new Coffee();
    }
}
