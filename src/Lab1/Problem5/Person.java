package Lab1.Problem5;

public class Person {
    private final Gender gender;
    private final String name; // optional

    public Person(Gender gender) {
        this(gender, "");
    }

    public Person(Gender gender, String name) {
        this.gender = gender;
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return String.format("Person{name=%s, gender=%s}", name, gender);
    }
}

