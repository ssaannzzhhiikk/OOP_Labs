package Practice4.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cat whiskers = new Cat("Whiskers", 3, "black");
        Cat ginger = new Cat("Ginger", 5, "orange");

        Student alice = new Student("Alice", 50.00, "Computer Science", 3.9);
        Student bob = new Student("Bob", 8.00, "Mathematics", 3.4);
        Student carol = new Student("Carol", 0.00, "Physics", 3.7);

        Restaurant delpapa = new Restaurant("Del Papa");

        System.out.println("=== Animals ===");
        whiskers.makeSound();
        ginger.makeSound();
        System.out.println(whiskers);
        System.out.println(ginger);

        System.out.println("\n=== Students ===");
        alice.introduce();
        bob.introduce();
        carol.introduce();

        System.out.println("\n=== Restaurant ===");

        // Interface type reference — Restaurant doesn't care it's a Cat
        CanHavePizza eater = whiskers;
        delpapa.servePizza(eater);

        delpapa.servePizza(alice); // has money
        delpapa.servePizza(bob);   // barely has money
        delpapa.servePizza(carol); // broke, gets rejected

        System.out.println("\n=== Student other abilities ===");
        alice.move();
        alice.dance();
        alice.takeRetake();

        List<Student> students = new ArrayList<>();
        students.add(alice);
        students.add(bob);
        students.add(carol);

    }
}