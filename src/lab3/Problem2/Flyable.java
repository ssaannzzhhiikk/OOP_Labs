package lab3.Problem2;


public interface Flyable extends Moveable {
    void fly(double dz);
    double getAltitude();

    default void printFullPosition() {
        System.out.printf("  Position: (%.1f, %.1f, alt=%.1f)%n", getX(), getY(), getAltitude());
    }
}
