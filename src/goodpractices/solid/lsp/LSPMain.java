package goodpractices.solid.lsp;

public class LSPMain {
    public static void main(String[] args) {
        CarService service = new CarService();
        Vehicle audi = new Vehicle("Audi");
        service.repairCar(audi);

        Truck truck = new Truck("Volvo");
        service.repairCar(truck);
    }
}
