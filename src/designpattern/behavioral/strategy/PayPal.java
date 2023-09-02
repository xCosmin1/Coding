package designpattern.behavioral.strategy;

public class PayPal implements PayStrategy{



    @Override
    public void pay(int amount) {
        System.out.println("Platim cu paypal comanda cu suma de " +amount);
    }

}
