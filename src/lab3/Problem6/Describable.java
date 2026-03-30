package lab3.Problem6;

public interface Describable {
    String describe();

    default void printDescription() {
        System.out.println("[" + getClass().getSimpleName() + "] " + describe());
    }
}
