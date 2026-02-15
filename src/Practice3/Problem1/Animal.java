package Practice3.Problem1;

public class Animal {

    private final String name;
    private final int age;

    public Animal() {
        this.name = "";
        this.age = 0;
    }

    public Animal(String name, int age) {
        if(age < 0)
            throw new IllegalArgumentException("Age cannot be negative");

        this.name = name;
        this.age = age;
    }

    public void makeSound(){

    }

    public void eat(String food, double amount) {
        System.out.println(name + " eats " + amount + " kg of " + food);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
