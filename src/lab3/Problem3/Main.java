package lab3.Problem3;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== MyArrayList ===");
        MyCollection<String> list = new MyArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println("Contains Banana: " + list.contains("Banana"));
        list.remove("Apple");
        System.out.println("After remove: " + list);

        System.out.println("\n=== MySimpleSet ===");
        MyCollection<String> set = new MySimpleSet<>();
        set.add("Alpha");
        set.add("Beta");
        boolean added = set.add("Alpha");
        set.add("Gamma");
        System.out.println(set);
        System.out.println("Duplicate added? " + added);

        System.out.println("\n=== Bulk ops ===");
        MyCollection<String> extra = new MyArrayList<>();
        extra.add("Delta");
        extra.add("Beta");
        set.addAll(extra);
        System.out.println("After addAll: " + set);
        MyCollection<String> toRemove = new MyArrayList<>();
        toRemove.add("Beta");
        toRemove.add("Gamma");
        set.removeAll(toRemove);
        System.out.println("After removeAll: " + set);
    }
}
