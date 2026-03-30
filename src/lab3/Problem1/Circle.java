package lab3.Problem1;

public class Circle implements Drawable, Resizable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle  radius=" + radius + "  color=" + getColor());
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
        System.out.println("Circle resized  new radius=" + radius);
    }
}
