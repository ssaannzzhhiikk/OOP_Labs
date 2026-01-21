package Practice1;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int area = a * a;
        int perimeter = 4*a;
        double diagonal = Math.sqrt(2) * a;

        System.out.println("Area: " + area + ", Perimeter: " + perimeter + ", Diagonal: " + diagonal);
    }
}
