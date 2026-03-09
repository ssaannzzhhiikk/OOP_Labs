package Lab2.problem5;

public class TestPetSystem {
    public static void main(String[] args) {
        Person john  = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science", "AI");
        Person bob   = new Student("Bob", 22, "Biology");

        Animal murka  = new Cat("Murka", 5);
        Animal rex    = new Dog("Rex", 3);
        Animal tweety = new Bird("Tweety", 2);

        john.assignPet(murka);
        bob.assignPet(tweety);

        // Try to give dog to PhD student (should be blocked)
        System.out.println("--- Trying to assign Dog to PhD student ---");
        alice.assignPet(rex);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
        registry.addPerson(bob);

        System.out.println("\n--- Initial state ---");
        System.out.println(registry);

        // John goes on vacation, leaves Murka with Alice
        System.out.println("--- John leaves pet with Alice ---");
        john.leavePetWith(alice);
        System.out.println(registry);

        // John comes back and retrieves Murka
        System.out.println("--- John retrieves pet from Alice ---");
        john.retrievePetFrom(alice);
        System.out.println(registry);

        System.out.println("People with pets:    " + registry.getPeopleWithPets().size());
        System.out.println("People without pets: " + registry.getPeopleWithoutPets().size());
    }
}
