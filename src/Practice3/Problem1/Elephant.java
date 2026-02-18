package Practice3.Problem1;

public class Elephant extends Animal {

    private final double trunkLength;

    public Elephant() {
        super();
        this.trunkLength = 1.0;
    }

    public Elephant(String name, int age, double trunkLength) {
        super(name, age);
        if (trunkLength <= 0)
            throw new IllegalArgumentException("Invalid trunk length");
        this.trunkLength = trunkLength;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes a trumpet sound!");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " uses its trunk to eat " + food);
    }

    public void eat(String food, double amount) {
        System.out.println(getName() + " eats " + amount + " kg of " + food);
    }

    public double getTrunkLength() { return trunkLength; }

    @Override
    public String toString() {
        return "Elephant{name='" + getName() + "', age=" + getAge() + ", trunkLength=" + trunkLength + "}";
    }
}