package lab3.Problem1;


public class Main {
    public static void main(String[] args) {
        System.out.println("=== Interface: Drawable & Resizable ===");
        Circle c = new Circle(5.0);
        c.draw();
        c.resize(2);
        c.draw();

        TextLabel label = new TextLabel("Hello, World!");
        label.draw();

        System.out.println("\n=== Abstract Class: Shape hierarchy ===");
        Shape[] shapes = {
            new Rectangle("red", 4, 6),
            new EquilateralTriangle("blue", 5)
        };
        for (Shape s : shapes) s.printInfo();
    }
}
