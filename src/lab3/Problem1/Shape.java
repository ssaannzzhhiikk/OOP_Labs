package lab3.Problem1;

public abstract class Shape {
    protected String color;
    protected String borderStyle;

    public Shape(String color, String borderStyle) {
        this.color = color;
        this.borderStyle = borderStyle;
    }

    public abstract double area();
    public abstract double perimeter();

    public void printInfo() {
        System.out.printf("%-20s color=%-8s border=%-6s area=%-8.2f perimeter=%.2f%n",
                getClass().getSimpleName(), color, borderStyle, area(), perimeter());
    }
}
