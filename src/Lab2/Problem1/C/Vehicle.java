package Lab2.Problem1.C;

import java.util.Objects;

public class Vehicle {
    private final String brand;
    private final int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() { return brand; }
    public int getYear() { return year; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle v = (Vehicle) o;
        return year == v.year && Objects.equals(brand, v.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, year);
    }

    @Override
    public String toString() {
        return "Vehicle{brand='" + brand + "', year=" + year + "}";
    }
}
