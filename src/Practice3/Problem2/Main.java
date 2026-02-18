package Practice3.Problem2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Set<Person> people = new HashSet<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1. Add Person");
            System.out.println("2. Add Student");
            System.out.println("3. Add Staff");
            System.out.println("4. Print all");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addPerson();
                case 2 -> addStudent();
                case 3 -> addStaff();
                case 4 -> printAll();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option, try again.");
            }
        }
    }

    private static void addPerson() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();

        people.add(new Person(name, address));
        System.out.println("Person added.");
    }

    private static void addStudent() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Program: ");
        String program = scanner.nextLine();
        System.out.print("Year: ");
        int year = scanner.nextInt();
        System.out.print("Fee: ");
        double fee = scanner.nextDouble();
        scanner.nextLine();

        people.add(new Student(name, address, program, year, fee));
        System.out.println("Student added.");
    }

    private static void addStaff() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("School: ");
        String school = scanner.nextLine();
        System.out.print("Pay: ");
        double pay = scanner.nextDouble();
        scanner.nextLine();

        people.add(new Staff(name, address, school, pay));
        System.out.println("Staff added.");
    }

    private static void printAll() {
        if (people.isEmpty()) {
            System.out.println("No users added yet.");
            return;
        }
        System.out.println("\n--- All Users ---");
        for (Person p : people) {
            System.out.println(p);
        }
        System.out.println("Total: " + people.size());
    }
}