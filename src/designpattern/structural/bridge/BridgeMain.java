package designpattern.structural.bridge;

public class BridgeMain {
    public static void main(String[] args) {
       CoffeePurchase coffeePurchase = new CoffeePurchase();
       Drink coffee = coffeePurchase.buy(10);

        System.out.println(coffee);
    }
}
