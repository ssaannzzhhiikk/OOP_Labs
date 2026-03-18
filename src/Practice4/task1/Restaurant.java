package Practice4.task1;

public class Restaurant {

    private String name;
    private static final double PIZZA_PRICE = 9.99;

    public Restaurant(String name) {
        this.name = name;
    }

    public boolean servePizza(CanHavePizza eater) {
        System.out.println("\n[" + name + "] Serving pizza...");

        if (eater instanceof Person person) {
            boolean paid = person.pay(PIZZA_PRICE);
            if (!paid) {
                System.out.println("[" + name + "] Sorry, payment failed. No pizza for you!");
                return false;
            }
        }

        eater.eatPizza();
        System.out.println("[" + name + "] Pizza served! Enjoy 🍕");
        return true;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return "Restaurant[name=" + name + "]";
    }
}
