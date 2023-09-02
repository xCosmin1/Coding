package designpattern.behavioral.strategy;

public class CardCredit implements PayStrategy{



    @Override
    public void pay(int amount) {
        System.out.println("Platim comanda cu cardul pentru suma de  " +amount);
    }
}
