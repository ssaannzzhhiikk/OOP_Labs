package lab3.Problem1;

public class EquilateralTriangle extends Shape {
    private double side;

    public EquilateralTriangle(String color, double side) {
        super(color, "dashed");
        this.side = side;
    }

    @Override
    public double area() { return (Math.sqrt(3) / 4) * side * side; }

    @Override
    public double perimeter() { return 3 * side; }
}
