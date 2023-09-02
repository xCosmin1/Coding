package designpattern.structural.bridge;

public class Tea implements Drink{
    @Override
    public String getVolume() {
        return "250ml";
    }

    @Override
    public double sugarQuantity() {
        return 0;
    }
}
