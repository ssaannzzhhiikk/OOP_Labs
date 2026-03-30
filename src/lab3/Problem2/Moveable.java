package lab3.Problem2;


public interface Moveable {
    void move(double dx, double dy);
    double getX();
    double getY();

    default void printPosition() {
        System.out.printf("  Position: (%.1f, %.1f)%n", getX(), getY());
    }
}
