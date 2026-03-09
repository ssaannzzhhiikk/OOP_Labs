package Lab2.Problem1.C;

import java.util.Objects;

public class Car extends Vehicle {
    private final String licensePlate;

    public Car(String brand, int year, String licensePlate) {
        super(brand, year);
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() { return licensePlate; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car c = (Car) o;
        return super.equals(o) && Objects.equals(licensePlate, c.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), licensePlate);
    }

    @Override
    public String toString() {
        return "Car{brand='" + getBrand() + "', year=" + getYear() + ", plate='" + licensePlate + "'}";
    }
}
