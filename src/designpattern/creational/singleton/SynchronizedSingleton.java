package designpattern.creational.singleton;

//DOUBLE CHECKED-LAZY SINGLETON
public class SynchronizedSingleton {

    private static SynchronizedSingleton INSTANCE;

    private SynchronizedSingleton() {

    }

    public static SynchronizedSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (SynchronizedSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SynchronizedSingleton();
                }
            }

        }
        return INSTANCE;
    }

}
