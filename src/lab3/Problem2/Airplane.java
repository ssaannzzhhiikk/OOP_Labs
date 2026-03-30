package lab3.Problem2;


public class Airplane implements Flyable {
    private String flightNumber;
    private double x, y, altitude;

    public Airplane(String flightNumber, double x, double y, double altitude) {
        this.flightNumber = flightNumber;
        this.x = x;
        this.y = y;
        this.altitude = altitude;
    }

    @Override public void move(double dx, double dy) { x += dx; y += dy; }
    @Override public void fly(double dz) { altitude += dz; }
    @Override public double getX() { return x; }
    @Override public double getY() { return y; }
    @Override public double getAltitude() { return altitude; }

    @Override public String toString() { return "Airplane[" + flightNumber + "]"; }
}
