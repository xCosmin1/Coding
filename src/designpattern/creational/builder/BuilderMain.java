package designpattern.creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        Car car1 = new Car.CarBuilder("diesel").withColor("gri metalizat").build();

        System.out.println(car1);

        Car car2 = new Car.CarBuilder("electric").withAC(true).withSeatHeating(true).withColor("red").build();
        System.out.println(car2);
    }
}
