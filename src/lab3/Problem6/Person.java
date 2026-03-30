package lab3.Problem6;


public class Person implements Comparable<Person>, Cloneable, Identifiable, Describable {
    private String id;
    private String name;
    private int age;
    private String email;

    public Person(String id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }

    @Override public String getId() { return id; }

    @Override
    public String describe() {
        return name + ", age " + age + " <" + email + ">";
    }

    @Override
    public int compareTo(Person other) {
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
        if (!(o instanceof Person)) return false;
        return id.equals(((Person) o).id);
    }

    @Override public int hashCode() { return id.hashCode(); }
}
