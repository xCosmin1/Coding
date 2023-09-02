package designpattern.creational.singleton;


//EAGER SINGLETON
public class SimpleCounter {

    private int counter;

    private static final SimpleCounter INSTANCE = new SimpleCounter();

    private SimpleCounter() {
    }

    public void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static SimpleCounter getInstance(){
        return INSTANCE;
    }

}
