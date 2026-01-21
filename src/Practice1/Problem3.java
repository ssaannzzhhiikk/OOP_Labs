package Practice1;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double grade = sc.nextDouble();

        if (grade >= 94.5) {
            System.out.println("A");
        } else if (grade >= 89.5) {
            System.out.println("A-");
        } else if (grade >= 84.5) {
            System.out.println("B+");
        } else if (grade >= 79.5) {
            System.out.println("B");
        } else if (grade >= 74.5) {
            System.out.println("B-");
        } else if (grade >= 69.5) {
            System.out.println("C+");
        } else if (grade >= 64.5) {
            System.out.println("C");
        } else if (grade >= 59.5) {
            System.out.println("C-");
        } else if (grade >= 54.5) {
            System.out.println("D+");
        } else if (grade >= 49.5) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }


    }
}
