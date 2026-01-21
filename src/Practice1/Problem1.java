package Practice1;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String repeated = "-".repeat(name.length());

        System.out.println("+" + repeated + "+");
        System.out.println("|" + name + "|");
        System.out.println("+" + repeated + "+");
    }
}
