package designpattern.behavioral.cor;

public interface Dispenser {

    void cashOut(int amount);

    void setNextDispenser(Dispenser nextDispenser);

}
