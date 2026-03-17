package Practice4;

public class Cat extends Animal implements CanHavePizza {

    private String furColor;

    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow! 🐱");
    }

    @Override
    public void eatPizza() {
        System.out.println(getName() + " the " + furColor + " cat sneaks a slice"
                + " (size " + PIZZA_SIZE + ") and nibbles on it. Purrrr...");
    }

    public String getFurColor() { return furColor; }

    @Override
    public String toString() {
        return "Cat[name=" + getName() + ", age=" + getAge()
                + ", furColor=" + furColor + "]";
    }
}
