package lab3.Problem6;


public interface Identifiable {
    String getId();

    default String getLabel() {
        return getClass().getSimpleName() + "#" + getId();
    }
}
