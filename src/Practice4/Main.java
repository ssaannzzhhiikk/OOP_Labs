package Practice4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cat whiskers = new Cat("Whiskers", 3, "black");
        Cat ginger   = new Cat("Ginger",   5, "orange");

        Student alice = new Student("Alice", 50.00, "Computer Science", 3.9);
        Student bob   = new Student("Bob",    8.00, "Mathematics",      3.4);
        Student carol = new Student("Carol",  0.00, "Physics",          3.7);

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

        // Custom Comparator — sorted by GPA highest first
        System.out.println("\n=== Students sorted by GPA (desc) ===");
        Collections.sort(students, new GpaComparator());
        for (Student s : students) System.out.println(s);

        // Natural order from Comparable — lowest GPA first
        System.out.println("\n=== Students sorted by GPA (asc) ===");
        Collections.sort(students);
        for (Student s : students) System.out.println(s);

        // Counting sort on a simple int array
        System.out.println("\n=== Counting Sort ===");
        int[] a = {1, 2, 3, 4, 1, 1, 4, 5, 2, 1};
        int[] sorted = countingSort(a, 6);
        System.out.print("Sorted: ");
        for (int v : sorted) System.out.print(v + " ");
        System.out.println();
    }

    // Count occurrences, then rebuild the array in order
    private static int[] countingSort(int[] a, int maxVal) {
        int[] b = new int[maxVal];
        for (int v : a) b[v]++;

        int[] result = new int[a.length];
        int idx = 0;
        for (int i = 0; i < maxVal; i++) {
            for (int j = 0; j < b[i]; j++) {
                result[idx++] = i;
            }
        }
        return result;
    }
}