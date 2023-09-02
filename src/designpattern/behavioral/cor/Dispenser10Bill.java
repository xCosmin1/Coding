package designpattern.behavioral.cor;

public class Dispenser10Bill implements Dispenser {

    private Dispenser nextDispenser;

    @Override
    public void cashOut(int amount) {
        if (amount >= 10) {
            int numberOfBills = amount / 10;
            int rest = amount % 10;
            System.out.println("Am eliberat " + numberOfBills + "bancnote de 10 lei");
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
