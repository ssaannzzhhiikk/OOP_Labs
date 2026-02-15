package Practice3.Problem1;

public class Main {

    public static void main(String[] args) {

        System.out.println("Default elephant:");
        Elephant e1 = new Elephant();
        e1.makeSound();
        e1.eat("grass", 50);
        System.out.println(e1.getTrunkLength());
        System.out.println(e1);

        System.out.println();

        System.out.println("Elephant with parameters:");
        Elephant e2 = new Elephant("Dumbo", 10, 2.5);
        e2.makeSound();
        e2.eat("fruits", 30);
        System.out.println(e2);

        System.out.println();

        System.out.println("Polymorphism example:");
        Animal animal = new Elephant("Big One", 15, 3.0);
        animal.makeSound();
        System.out.println();
        animal.eat("leaves", 40);
        System.out.println(animal);
    }
}
