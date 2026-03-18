package Practice4.task2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student[] arr = {
            new Student("Zara",  3.5, 22),
            new Student("Alice", 3.9, 20),
            new Student("Bob",   2.8, 21),
            new Student("Diana", 3.9, 23),
            new Student("Carol", 3.1, 20)
        };

        List<Student> list = new ArrayList<>();
        for (Student s : arr) list.add(s);

        System.out.println("=== 1. toString ===");
        System.out.println(arr[0]);
        System.out.println("Direct: " + arr[1]);

        System.out.println("\n=== 2. equals vs == ===");
        Student s1 = new Student("Alice", 3.9, 20);
        Student s2 = new Student("Alice", 3.9, 20);
        Student s3 = s1;

        System.out.println("s1 == s2     : " + (s1 == s2));
        System.out.println("s1 == s3     : " + (s1 == s3));
        System.out.println("s1.equals(s2): " + s1.equals(s2));

        System.out.println("\n=== 3. compareTo ===");
        Student alice = new Student("Alice", 3.9, 20);
        Student bob   = new Student("Bob",   2.8, 21);

        System.out.println("alice.compareTo(bob) = " + alice.compareTo(bob));

        if (alice.compareTo(bob) < 0) {
            System.out.println("Alice ranks before Bob");
        }

        Collections.sort(list);
        System.out.println("\nCollections.sort(list) — GPA descending:");
        for (Student s : list) System.out.println("  " + s);

        System.out.println("\n=== 4. Comparator ===");

        Collections.sort(list, new NameComparator());
        System.out.println("NameComparator — A to Z:");
        for (Student s : list) System.out.println("  " + s);

        Collections.sort(list, new GpaComparator());
        System.out.println("\nGpaComparator — GPA ascending:");
        for (Student s : list) System.out.println("  " + s);

        Collections.sort(list, new AgeComparator());
        System.out.println("\nAgeComparator — age ascending:");
        for (Student s : list) System.out.println("  " + s);

        System.out.println("\n=== 5. Manual selection sort by GPA ===");
        Student[] a = {
            new Student("Zara",  3.5, 22),
            new Student("Alice", 3.9, 20),
            new Student("Bob",   2.8, 21),
            new Student("Diana", 3.9, 23),
            new Student("Carol", 3.1, 20)
        };

        for (int i = 0; i < a.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].gpa > a[maxIndex].gpa) {
                    maxIndex = j;
                }
            }
            Student temp  = a[i];
            a[i]          = a[maxIndex];
            a[maxIndex]   = temp;
        }

        for (Student s : a) System.out.println("  " + s);

        System.out.println("\n=== 6. Counting sort ===");

        int[] input = {1, 2, 3, 4, 1, 1, 4, 5, 2, 1};

        int max = 0;
        for (int val : input) if (val > max) max = val;

        int[] b = new int[max + 1];

        for (int i = 0; i < input.length; i++) {
            b[input[i]]++;
        }

        System.out.print("Count array: ");
        for (int i = 0; i <= max; i++) System.out.print("b[" + i + "]=" + b[i] + " ");
        System.out.println();

        System.out.print("Sorted: ");
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j < b[i]; j++) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("\n=== 7. Custom Gradable interface ===");
        GradStudent[] gs = {
            new GradStudent("Mia",  3.8),
            new GradStudent("Leo",  1.9),
            new GradStudent("Nora", 3.2)
        };

        for (GradStudent g : gs) System.out.println(g);

        Gradable ref = new GradStudent("Sam", 2.5);
        System.out.println("\nThrough Gradable reference:");
        System.out.println("  GPA      : " + ref.getGpa());
        System.out.println("  Grade    : " + ref.getGrade());
        System.out.println("  Passing? : " + ref.isPassing());
    }
}
