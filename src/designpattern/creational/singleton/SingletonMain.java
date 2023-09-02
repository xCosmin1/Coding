package designpattern.creational.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        SimpleCounter counter1 = SimpleCounter.getInstance();

        SimpleCounter counter2 = SimpleCounter.getInstance();

        counter1.increment();

        System.out.println(counter1.getCounter());
        System.out.println(counter2.getCounter());


        LazySingleton singleton = LazySingleton.getInstance();
        System.out.println(singleton);

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.increment();
        System.out.println(enumSingleton.getCounter());
    }
}
