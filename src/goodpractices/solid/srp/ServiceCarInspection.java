package goodpractices.solid.srp;

import java.time.LocalDate;

public class ServiceCarInspection {
    public void makeCarInspection(Car car){
        if(car.isInspectionOverdue()){
            System.out.println("WArning: the car was used after the inspection expired");
        }
        System.out.println("Check brakes, check engine " +car);
        car.setLastInspection(LocalDate.now());
    }
}
