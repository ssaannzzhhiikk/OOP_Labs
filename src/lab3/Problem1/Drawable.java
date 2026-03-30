package lab3.Problem1;

public interface Drawable {
    void draw();
    default String getColor() { return "black"; }
}
