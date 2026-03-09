package Lab2.Problem1.A;

public class Test {
    public static void main(String[] args) {
        Shape3D cylinder = new Cylinder(3, 5);
        Shape3D sphere = new Sphere(4);
        Shape3D cube = new Cube(2);

        System.out.println("Cylinder: " + cylinder);
        System.out.println("Sphere:   " + sphere);
        System.out.println("Cube:     " + cube);
    }
}
