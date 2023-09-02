package designpattern.structural.bridge;

public class Coffee implements Drink{

    private boolean hasMilk;
    private int sugar;

    @Override
    public String getVolume() {
        return "500ml";
    }

    @Override
    public double sugarQuantity() {
        return sugar;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "hasMilk=" + hasMilk +
                ", sugar=" + sugar +
                '}';
    }
}
