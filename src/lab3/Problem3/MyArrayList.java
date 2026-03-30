package lab3.Problem3;


public class MyArrayList<E> implements MyCollection<E> {
    private Object[] data = new Object[8];
    private int count = 0;

    @Override
    public boolean add(E element) {
        ensureCapacity();
        data[count++] = element;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < count; i++) {
            if (data[i].equals(o)) {
                System.arraycopy(data, i + 1, data, i, count - i - 1);
                data[--count] = null;
                return true;
            }
        }
        return false;
    }

    @Override public void clear() { count = 0; }
    @Override public boolean isEmpty() { return count == 0; }
    @Override public int size() { return count; }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < count; i++) if (data[i].equals(o)) return true;
        return false;
    }

    @Override
    public Object[] toArray() {
        Object[] copy = new Object[count];
        System.arraycopy(data, 0, copy, 0, count);
        return copy;
    }

    private void ensureCapacity() {
        if (count == data.length) {
            Object[] bigger = new Object[data.length * 2];
            System.arraycopy(data, 0, bigger, 0, count);
            data = bigger;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MyArrayList[");
        for (int i = 0; i < count; i++) {
            sb.append(data[i]);
            if (i < count - 1) sb.append(", ");
        }
        return sb.append("]").toString();
    }
}
