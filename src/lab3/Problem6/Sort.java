package lab3.Problem6;


public class Sort {
    static <E> void swap(E[] a, int i, int j) {
        E t = a[i]; a[i] = a[j]; a[j] = t;
    }

    static <E extends Comparable<E>> void bubbleSort(E[] a) {
        for (int i = 0; i < a.length - 1; i++)
            for (int j = 0; j < a.length - i - 1; j++)
                if (a[j].compareTo(a[j + 1]) > 0) swap(a, j, j + 1);
    }
}
