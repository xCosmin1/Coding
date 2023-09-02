package goodpractices.solid.srp;

import java.time.LocalDate;
import java.time.Period;

public class Car {

    private LocalDate fabricationDate;
    private LocalDate lastInspection;

    public Car(LocalDate fabricationDate, LocalDate lastInspection) {
        this.fabricationDate = fabricationDate;
        this.lastInspection = lastInspection;
    }

    public LocalDate getFabricationDate() {
        return fabricationDate;
    }

    public LocalDate getLastInspection() {
        return lastInspection;
    }

    public void setLastInspection(LocalDate lastInspection) {
        this.lastInspection = lastInspection;
    }

    public boolean isInspectionOverdue(){
        LocalDate currentDate = LocalDate.now();
        Period timeSinceLastInspection = Period.between(lastInspection, currentDate);
        return timeSinceLastInspection.getYears() >= 2;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fabricationDate=" + fabricationDate +
                ", lastInspection=" + lastInspection +
                '}';
    }
}
