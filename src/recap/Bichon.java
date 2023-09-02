package recap;

public class Bichon extends Dog {
    private String color;

    public Bichon(String name, String race, String color) {
        super(name, race);
        System.out.println("Constructor Bichon");
    }

    @Override
    public void hamHam() {

        System.out.println("ham ham clasa bichon");
    }
}
