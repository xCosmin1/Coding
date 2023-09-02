package designpattern.behavioral.strategy;

public class StrategyMain {
    public static void main(String[] args) {

        Order order = new Order(500);
        order.payOrder(new CardCredit());

        order.payOrder(new PayPal());

    }
}
