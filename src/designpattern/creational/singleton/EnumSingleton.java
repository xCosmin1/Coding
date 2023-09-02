package designpattern.creational.singleton;

public enum EnumSingleton {
    INSTANCE;

    private int counter;

    public void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
