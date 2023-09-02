package designpattern.behavioral.strategy;

public class Order {
    private int total;

    public Order(int total) {
        this.total = total;
    }

    public void payOrder(PayStrategy strategy){
        strategy.pay(total);
    }

}
