package lab3.Problem3;


public class MySimpleSet<E> implements MyCollection<E> {
    private final MyArrayList<E> inner = new MyArrayList<>();

    @Override
    public boolean add(E element) {
        if (inner.contains(element)) return false;
        inner.add(element);
        return true;
    }

    @Override public boolean remove(Object o) { return inner.remove(o); }
    @Override public void clear() { inner.clear(); }
    @Override public boolean isEmpty() { return inner.isEmpty(); }
    @Override public int size() { return inner.size(); }
    @Override public boolean contains(Object o) { return inner.contains(o); }
    @Override public Object[] toArray() { return inner.toArray(); }

    @Override
    public String toString() {
        return "MySimpleSet" + inner.toString().substring("MyArrayList".length());
    }
}
