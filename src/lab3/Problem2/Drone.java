package lab3.Problem2;


public class Drone implements Flyable {
    private String id;
    private double x, y, altitude;

    public Drone(String id, double x, double y, double altitude) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.altitude = altitude;
    }

    @Override public void move(double dx, double dy) { x += dx; y += dy; }
    @Override public void fly(double dz) { altitude += dz; }
    @Override public double getX() { return x; }
    @Override public double getY() { return y; }
    @Override public double getAltitude() { return altitude; }

    @Override public String toString() { return "Drone[" + id + "]"; }
}
