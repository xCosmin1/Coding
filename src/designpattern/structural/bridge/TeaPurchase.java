package designpattern.structural.bridge;

public class TeaPurchase implements DrinkPurchase{
    @Override
    public Drink buy(double cost) {
        System.out.println("Cumparam un ceai cu valoarea de " +cost);
        return new Tea();
    }
}
