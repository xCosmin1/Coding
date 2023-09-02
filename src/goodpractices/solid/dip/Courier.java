package goodpractices.solid.dip;

public class Courier {

    public void deliverPackage(String packageName, LandVehicle vehicle) {
        System.out.println("Take package: " + packageName);
        vehicle.ride();
        System.out.println("Deliver package ");
    }
}
