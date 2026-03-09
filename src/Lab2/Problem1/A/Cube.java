package Lab2.Problem1.A;

public class Cube extends Shape3D {
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }

    @Override
    public double surfaceArea() {
        return 6 * side * side;
    }
}
