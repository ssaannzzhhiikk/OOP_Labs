package Lab2.Problem1.A;

public abstract class Shape3D {
    public abstract double volume();
    public abstract double surfaceArea();

    @Override
    public String toString() {
        return String.format("Volume: %.2f, Surface Area: %.2f", volume(), surfaceArea());
    }
}
