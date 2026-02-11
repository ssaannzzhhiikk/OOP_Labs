package Lab1.Problem5;

import java.util.Vector;

public class DragonLaunch {
    private final Vector<Person> kidnapped;

    public DragonLaunch() {
        kidnapped = new Vector<>();
    }

    public void kidnap(Person p) {
        kidnapped.add(p);
    }

    public boolean willDragonEatOrNot() {
        int n = kidnapped.size();
        if (n == 0) return false;

        int write = 0;
        for (int read = 0; read < n; read++) {
            Person current = kidnapped.get(read);
            if (write > 0) {
                Person prev = kidnapped.get(write - 1);
                if (prev.getGender() == Gender.BOY && current.getGender() == Gender.GIRL) {
                    write--;
                    continue;
                }
            }
            kidnapped.set(write, current);
            write++;
        }

        kidnapped.setSize(write);
        return !kidnapped.isEmpty();
    }

    public void printLine() {
        System.out.print("Line: ");
        for (Person p : kidnapped) {
            System.out.print(p.getGender() == Gender.BOY ? "B" : "G");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DragonLaunch dl = new DragonLaunch();
        dl.kidnap(new Person(Gender.BOY));
        dl.kidnap(new Person(Gender.BOY));
        dl.kidnap(new Person(Gender.GIRL));
        dl.kidnap(new Person(Gender.GIRL));
        System.out.print("Before: ");
        dl.printLine();
        boolean willEat = dl.willDragonEatOrNot();
        System.out.print("After:  ");
        dl.printLine();
        System.out.println("Will dragon eat? " + (willEat ? "Yes " : "No"));

        DragonLaunch dl2 = new DragonLaunch();
        dl2.kidnap(new Person(Gender.GIRL));
        dl2.kidnap(new Person(Gender.BOY));
        dl2.kidnap(new Person(Gender.GIRL));
        dl2.kidnap(new Person(Gender.BOY));
        System.out.print("Before: ");
        dl2.printLine();
        boolean willEat2 = dl2.willDragonEatOrNot();
        System.out.print("After:  ");
        dl2.printLine();
        System.out.println("Will dragon eat? " + (willEat2 ? "Yes" : "No"));
    }
}

