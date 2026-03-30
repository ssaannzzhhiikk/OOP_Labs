package lab3.Problem6;


public class Pet implements Comparable<Pet>, Cloneable, Identifiable, Describable {
    private String id;
    private String name;
    private String species;
    private String breed;
    private int age;
    private Person owner;

    public Pet(String id, String name, String species, String breed, int age, Person owner) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.owner = owner;
    }

    public String getName() { return name; }
    public String getSpecies() { return species; }
    public Person getOwner() { return owner; }

    @Override public String getId() { return id; }

    @Override
    public String describe() {
        return name + " - " + breed + " " + species + ", " + age + " yr(s)"
                + (owner != null ? ", owned by " + owner.getName() : "");
    }

    @Override
    public int compareTo(Pet other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() { return getLabel() + " -> " + describe(); }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pet)) return false;
        return id.equals(((Pet) o).id);
    }

    @Override public int hashCode() { return id.hashCode(); }
}
