package goodpractices.solid.dip;

public class Bicycle implements LandVehicle {
    @Override
    public void ride() {
        System.out.println("The bicycle is moving");
    }
}
