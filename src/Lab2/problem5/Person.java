package Lab2.problem5;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.pet = null;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public Animal getPet() { return pet; }

    public void assignPet(Animal pet) {
        this.pet = pet;
    }

    public void removePet() {
        this.pet = null;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public abstract String getOccupation();

    public void leavePetWith(Person other) {
        if (!hasPet()) {
            System.out.println(name + " has no pet to leave.");
            return;
        }
        if (other instanceof PhDStudent && pet instanceof Dog) {
            System.out.println("Cannot leave a Dog with a PhD student — they're too busy!");
            return;
        }
        if (other.hasPet()) {
            System.out.println(other.getName() + " already has a pet and cannot take another.");
            return;
        }
        other.assignPet(pet);
        removePet();
        System.out.println(name + " left " + other.getPet().getName() + " with " + other.getName());
    }

    public void retrievePetFrom(Person other) {
        if (!other.hasPet()) {
            System.out.println(other.getName() + " does not have your pet.");
            return;
        }
        assignPet(other.getPet());
        other.removePet();
        System.out.println(name + " retrieved " + pet.getName() + " from " + other.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person p = (Person) o;
        return age == p.age && Objects.equals(name, p.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return getOccupation() + " " + name + " (age " + age + ")"
                + (hasPet() ? " — pet: " + pet : " — no pet");
    }
}
