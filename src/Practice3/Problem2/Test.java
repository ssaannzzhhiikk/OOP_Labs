package Practice3.Problem2;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        Set<Person> people = new HashSet<>();

        Person person = new Person("Alice", "London");
        Student student = new Student("Bob", "Paris", "Computer Science", 2, 3500.0);
        Staff staff = new Staff("Carol", "Berlin", "KBTU", 2500.0);

        person.setAddress("Manchester");

        student.setAddress("Lyon");
        student.setProgram("Data Science");
        student.setYear(3);
        student.setFee(4000.0);

        staff.setAddress("Munich");
        staff.setSchool("MIT");
        staff.setPay(3000.0);

        System.out.println("=== Person Info ===");
        System.out.println("Name:    " + person.getName());
        System.out.println("Address: " + person.getAddress());

        System.out.println("\n=== Student Info ===");
        System.out.println("Name:    " + student.getName());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Program: " + student.getProgram());
        System.out.println("Year:    " + student.getYear());
        System.out.println("Fee:     " + student.getFee());

        System.out.println("\n=== Staff Info ===");
        System.out.println("Name:    " + staff.getName());
        System.out.println("Address: " + staff.getAddress());
        System.out.println("School:  " + staff.getSchool());
        System.out.println("Pay:     " + staff.getPay());

        System.out.println("\n=== toString() ===");
        System.out.println(person);
        System.out.println(student);
        System.out.println(staff);

        people.add(person);
        people.add(student);
        people.add(staff);
        people.add(new Person("Alice", "Manchester")); // duplicate — won't be added

        System.out.println("\n=== All Users (HashSet) ===");
        for (Person p : people) {
            System.out.println(p);
        }

        System.out.println("\nTotal unique users: " + people.size()); // should be 3
    }
}