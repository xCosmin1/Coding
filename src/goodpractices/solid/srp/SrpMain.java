package goodpractices.solid.srp;

import java.time.LocalDate;
import java.time.Month;

public class SrpMain {
    public static void main(String[] args) {
        Car car1 = new Car(LocalDate.of(2012, Month.AUGUST, 25), LocalDate.of(2020, Month.JULY, 15));
        ServiceCarInspection itp = new ServiceCarInspection();
        System.out.println(car1.getLastInspection());
        itp.makeCarInspection(car1);
        System.out.println(car1.getLastInspection());
    }
}
