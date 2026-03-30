package lab3.Problem3;


public interface MyCollection<E> {
    boolean add(E element);
    boolean remove(Object o);
    void clear();
    boolean contains(Object o);
    int size();
    boolean isEmpty();
    Object[] toArray();

    default boolean addAll(MyCollection<? extends E> other) {
        boolean changed = false;
        for (Object o : other.toArray()) {
            @SuppressWarnings("unchecked") E e = (E) o;
            if (add(e)) changed = true;
        }
        return changed;
    }

    default boolean containsAll(MyCollection<?> other) {
        for (Object o : other.toArray())
            if (!contains(o)) return false;
        return true;
    }

    default boolean removeAll(MyCollection<?> other) {
        boolean changed = false;
        for (Object o : other.toArray())
            if (remove(o)) changed = true;
        return changed;
    }
}
