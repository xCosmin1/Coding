package recap;

public class Dog extends Animal {
    String race;

    public Dog(String name, String race) {
        super(name);

        System.out.println("Constructor dog");
    }

    public void hamHam() {
        System.out.println("Ham Ham clasa dog");
    }

}
