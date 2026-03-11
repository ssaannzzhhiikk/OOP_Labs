package Lab2.Problem1.C;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Vehicle> set = new HashSet<>();

        Car c1 = new Car("Toyota", 2020, "ABC123");
        Car c2 = new Car("Toyota", 2020, "ABC123"); // duplicate
        Car c3 = new Car("Honda", 2019, "XYZ999");
        Vehicle v1 = new Vehicle("Ford", 2018);

        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(v1);

        System.out.println("Set size (expected 3): " + set.size());
        for (Vehicle v : set) System.out.println(v);
    }
}