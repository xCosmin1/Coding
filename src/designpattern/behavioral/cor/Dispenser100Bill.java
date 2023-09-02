package designpattern.behavioral.cor;

public class Dispenser100Bill implements Dispenser {

    private Dispenser nextDispenser;

    @Override
    public void cashOut(int amount) {
        if (amount >= 100) {
            int numberOfBills = amount / 100;
            int rest = amount % 100;
            System.out.println("Am eliberat " + numberOfBills + "bancnote de 100 lei");
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
