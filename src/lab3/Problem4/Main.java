package lab3.Problem4;


import java.util.Arrays;
import java.util.Date;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws CloneNotSupportedException {
        Date d2018 = new Date(118, 5, 1);
        Date d2019 = new Date(119, 8, 15);
        Date d2021 = new Date(121, 2, 20);
        Date d2022 = new Date(122, 10, 5);

        Employee alice = new Employee("Alice", 60000, d2019, "NIN-001");
        Employee bob   = new Employee("Bob",   75000, d2018, "NIN-002");
        Employee carol = new Employee("Carol", 55000, d2022, "NIN-003");
        Manager  dave  = new Manager ("Dave",  75000, d2021, "NIN-004", 8000);
        Manager  eve   = new Manager ("Eve",   75000, d2021, "NIN-005", 5000);

        dave.addTeamMember(alice);
        dave.addTeamMember(carol);

        Employee[] all = {alice, bob, carol, dave, eve};

        System.out.println("=== All ===");
        for (Employee e : all) System.out.println(e);

        System.out.println("\n=== Sorted by salary ===");
        Arrays.sort(all);
        for (Employee e : all) System.out.println(e);

        System.out.println("\n=== Sorted by name ===");
        Arrays.sort(all, Employee.BY_NAME);
        for (Employee e : all) System.out.println(e);

        System.out.println("\n=== Sorted by hire date ===");
        Arrays.sort(all, Employee.BY_HIRE_DATE);
        for (Employee e : all) System.out.println(e);

        System.out.println("\n=== equals ===");
        Employee alice2 = new Employee("Alice", 60000, d2019, "NIN-001");
        System.out.println("alice.equals(alice2): " + alice.equals(alice2));
        System.out.println("alice.equals(bob):    " + alice.equals(bob));

        System.out.println("\n=== clone ===");
        Employee aliceClone = (Employee) alice.clone();
        System.out.println("Original: " + alice);
        System.out.println("Clone:    " + aliceClone);
        System.out.println("equals: " + alice.equals(aliceClone));
        aliceClone.getHireDate().setYear(100);
        System.out.println("After mutating clone date:");
        System.out.println("Original hireDate: " + alice.getHireDate());
        System.out.println("Clone hireDate:    " + aliceClone.getHireDate());

        Manager daveClone = (Manager) dave.clone();
        System.out.println("\nManager clone team size: " + daveClone.getTeam().size());
    }
}
