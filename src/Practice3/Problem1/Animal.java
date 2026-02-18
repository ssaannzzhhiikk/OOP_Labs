package Practice3.Problem1;

public class Animal {

    private final String name;
    private final int age;

    public Animal() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Animal(String name, int age) {
        if (age < 0)
            throw new IllegalArgumentException("Age cannot be negative");
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
    }

    public void eat(String food, int amount) {
        System.out.println(name + " eats " + amount + " " + food);
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + "}";
    }
}