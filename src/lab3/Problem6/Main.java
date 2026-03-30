package lab3.Problem6;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("=== People ===");
        Person zara = new Person("P001", "Zara", 22, "zara@mail.com");
        Person anna = new Person("P002", "Anna", 30, "anna@mail.com");
        Person mike = new Person("P003", "Mike", 25, "mike@mail.com");

        Person[] people = {zara, anna, mike};
        for (Person p : people) p.printDescription();

        System.out.println("\n--- Sorted by name ---");
        Sort.bubbleSort(people);
        for (Person p : people) System.out.println(p);

        System.out.println("\n--- Clone test ---");
        Person zaraClone = (Person) zara.clone();
        System.out.println("Original: " + zara);
        System.out.println("Clone:    " + zaraClone);
        System.out.println("equals(): " + zara.equals(zaraClone));
        System.out.println("== ref:   " + (zara == zaraClone));

        System.out.println("\n=== Pets ===");
        Pet rex   = new Pet("CHIP001", "Rex",   "Dog",    "German Shepherd", 3, zara);
        Pet bella = new Pet("CHIP002", "Bella", "Cat",    "Siamese",         5, anna);
        Pet rio   = new Pet("CHIP003", "Rio",   "Parrot", "African Grey",    8, mike);
        Pet max   = new Pet("CHIP004", "Max",   "Dog",    "Labrador",        2, zara);

        Pet[] pets = {rex, bella, rio, max};
        for (Pet p : pets) p.printDescription();

        System.out.println("\n--- Sorted by name ---");
        Sort.bubbleSort(pets);
        for (Pet p : pets) System.out.println(p);

        System.out.println("\n--- Labels ---");
        System.out.println(zara.getLabel());
        System.out.println(rex.getLabel());

        System.out.println("\n--- Pet clone ---");
        Pet rexClone = (Pet) rex.clone();
        System.out.println("Original: " + rex);
        System.out.println("Clone:    " + rexClone);
        System.out.println("Same owner ref: " + (rex.getOwner() == rexClone.getOwner()));
    }
}
