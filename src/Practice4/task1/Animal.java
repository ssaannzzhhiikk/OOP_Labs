package Practice4.task1;

public abstract class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age  = age;
    }

    public abstract void makeSound();

    public String getName() { return name; }
    public int    getAge()  { return age;  }

    public void setName(String name) {
        if (name != null && !name.isBlank()) this.name = name;
    }
    public void setAge(int age) {
        if (age >= 0) this.age = age;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[name=" + name + ", age=" + age + "]";
    }
}
