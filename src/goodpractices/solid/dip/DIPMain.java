package goodpractices.solid.dip;

public class DIPMain {
    public static void main(String[] args) {
        Courier courier = new Courier();
        courier.deliverPackage("Cadou", new Bicycle());
    }
}
