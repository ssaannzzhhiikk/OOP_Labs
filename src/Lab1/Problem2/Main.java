package Lab1.Problem2;

public class Main {

    enum Status {
        ACTIVE,
        GRADUATED,
        SUSPENDED
    }

    static class Student {

        static int totalStudents = 0;
        static final String UNIVERSITY = "KBTU";

        final int id;

        String name;
        int age;
        Status status;

        {
            status = Status.ACTIVE;
            System.out.println("Initialization block executed");
        }

        Student(int id, String name) {
            this.id = id;
            this.name = name;
            this.age = 18;
            totalStudents++;
        }

        Student(int id, String name, int age) {
            this(id, name);
            this.age = age;
        }

        void study() {
            System.out.println(name + " is studying");
        }

        void study(int hours) {
            System.out.println(name + " is studying for " + hours + " hours");
        }

        static void showTotalStudents() {
            System.out.println("Total students: " + totalStudents);
        }

        void showInfo() {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Status: " + status);
            System.out.println("University: " + UNIVERSITY);
            System.out.println("-------------------");
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student(1, "Alice");
        Student s2 = new Student(2, "Bob", 20);
        Student s3 = new Student(3, "Carl");

        s1.showInfo();
        s2.showInfo();
        s3.showInfo();

        s1.study();
        s2.study(3);
        s3.study(5);

        Student.showTotalStudents();
    }
}

