package Practice1;

import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Error: a cannot be zero.");
            return;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("There is no roots");
        } else {
            double sqrtD = Math.sqrt(discriminant);
            double x1 = (-b + sqrtD) / (2 * a);
            double x2 = (-b - sqrtD) / (2 * a);

            System.out.println("Root x1 = " + x1);
            System.out.println("Root x2 = " + x2);
        }
    }
}

