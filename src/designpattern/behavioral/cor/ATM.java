package designpattern.behavioral.cor;

public class ATM {

    private Dispenser dispenser;

    public ATM() {
        dispenser = new Dispenser100Bill();
        Dispenser dispenser10 = new Dispenser10Bill();
        Dispenser dispenser50 = new Dispenser50Bill();
        dispenser.setNextDispenser(dispenser50);
        dispenser50.setNextDispenser(dispenser10);
    }

    public void releaseMoney(int amount) {
        if (amount % 10 != 0) {
            System.out.println("Putem elibera doar multiplu de 10");
        } else {
            dispenser.cashOut(amount);
        }
    }
}