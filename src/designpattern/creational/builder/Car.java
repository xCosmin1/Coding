package designpattern.creational.builder;

public class Car {

    private String color;
    private String engineType;
    private int maxSpeed;

    private int numberOfSpeakers;
    private boolean electricWindows;
    private boolean AC;
    private boolean seatHeating;

    private Car(String engineType) {
        this.engineType = engineType;

    }

    public static class CarBuilder {
        private String color;
        private String engineType;
        private int maxSpeed;

        private int numberOfSpeakers;
        private boolean electricWindows;
        private boolean AC;
        private boolean seatHeating;

        public CarBuilder(String engineType) {
            this.engineType = engineType;
            this.numberOfSpeakers = 2;
        }

        public CarBuilder withColor(String color) {
            this.color = color;
            return this;

        }

        public CarBuilder withMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public CarBuilder withNumberOfSpeakers(int numberOfSpeakers) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public CarBuilder withElectricWindows(boolean electricWindows) {
            this.electricWindows = electricWindows;
            return this;
        }

        public CarBuilder withAC(boolean Ac) {
            this.AC = Ac;
            return this;
        }

        public CarBuilder withSeatHeating(boolean seatHeating) {
            this.seatHeating = seatHeating;
            return this;
        }

        public Car build() {
            Car car = new Car(this.engineType);
            car.color = this.color;
            car.maxSpeed = this.maxSpeed;
            car.AC = this.AC;
            car.electricWindows = this.electricWindows;
            car.numberOfSpeakers = this.numberOfSpeakers;
            car.seatHeating = this.seatHeating;
            return car;
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engineType='" + engineType + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", electricWindows=" + electricWindows +
                ", AC=" + AC +
                ", seatHeating=" + seatHeating +
                '}';
    }
}
