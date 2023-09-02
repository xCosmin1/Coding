package designpattern.behavioral.cor;

public class Dispenser50Bill implements Dispenser {

    private Dispenser nextDispenser;

    @Override
    public void cashOut(int amount) {
        if (amount >= 50) {
            int numberOfBills = amount / 50;
            int rest = amount % 50;
            System.out.println("Am eliberat " + numberOfBills + "bancnote de 50 de lei");
            if (rest > 0) {
                nextDispenser.cashOut(rest);
            }
        } else {
            nextDispenser.cashOut(amount);
        }

    }

    @Override
    public void setNextDispenser(Dispenser nextDispenser) {
        this.nextDispenser = nextDispenser;

    }
}
