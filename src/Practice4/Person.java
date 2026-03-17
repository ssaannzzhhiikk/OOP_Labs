package Practice4;

public abstract class Person {

    private String name;
    private double balance;

    public Person(String name, double balance) {
        this.name    = name;
        this.balance = balance;
    }

    public abstract void introduce();

    public boolean pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(name + " paid $" + String.format("%.2f", amount)
                    + ". Remaining balance: $" + String.format("%.2f", balance));
            return true;
        }
        System.out.println(name + " cannot afford $" + String.format("%.2f", amount) + "!");
        return false;
    }

    public String getName()    { return name;    }
    public double getBalance() { return balance; }

    public void setName(String name) {
        if (name != null && !name.isBlank()) this.name = name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + "[name=" + name + ", balance=$" + String.format("%.2f", balance) + "]";
    }
}
