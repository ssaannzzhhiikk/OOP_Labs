package lab3.Problem2;


public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla", 0, 0);
        car.move(10, 5);
        System.out.println(car);
        car.printPosition();

        Boat boat = new Boat("Titanic", 100, 200);
        boat.move(-20, 30);
        System.out.println(boat);
        boat.printPosition();

        Drone drone = new Drone("DJI-01", 0, 0, 50);
        drone.move(5, 5);
        drone.fly(100);
        System.out.println(drone);
        drone.printFullPosition();

        Airplane plane = new Airplane("KZ401", 500, 300, 10000);
        plane.move(200, 100);
        plane.fly(-2000);
        System.out.println(plane);
        plane.printFullPosition();

        System.out.println("\n=== Polymorphism ===");
        Moveable[] fleet = {car, boat, drone, plane};
        for (Moveable m : fleet) {
            m.move(1, 1);
            System.out.print(m + " -> ");
            m.printPosition();
        }
    }
}
