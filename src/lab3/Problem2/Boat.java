package lab3.Problem2;


public class Boat implements Moveable {
    private String name;
    private double x, y;

    public Boat(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    @Override public void move(double dx, double dy) { x += dx; y += dy; }
    @Override public double getX() { return x; }
    @Override public double getY() { return y; }

    @Override public String toString() { return "Boat[" + name + "]"; }
}
