package lab3.Problem2;


public class Car implements Moveable {
    private String model;
    private double x, y;

    public Car(String model, double x, double y) {
        this.model = model;
        this.x = x;
        this.y = y;
    }

    @Override public void move(double dx, double dy) { x += dx; y += dy; }
    @Override public double getX() { return x; }
    @Override public double getY() { return y; }

    @Override public String toString() { return "Car[" + model + "]"; }
}
