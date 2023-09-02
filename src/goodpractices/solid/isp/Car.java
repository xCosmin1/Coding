package goodpractices.solid.isp;

public class Car implements MovingVehicle{



    @Override
    public void accelerate() {
        System.out.println("Masina accelereaza");
    }

    @Override
    public void decelerate() {
        System.out.println("Masina franeaza");
    }
}
