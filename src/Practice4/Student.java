package Practice4;

import java.util.Objects;

public class Student extends Person
        implements CanHavePizza, CanHaveRetake, CanHaveParty, Movable, Comparable<Student> {

    private String major;
    private double gpa;

    public Student(String name, double balance, String major, double gpa) {
        super(name, balance);
        this.major = major;
        this.gpa   = gpa;
    }

    @Override
    public void introduce() {
        System.out.println("Hi! I'm " + getName() + ", studying " + major
                + " with GPA " + String.format("%.2f", gpa) + ".");
    }

    @Override
    public void eatPizza() {
        System.out.println(getName() + " grabs a pizza slice (size " + PIZZA_SIZE
                + ") between lectures. So good!");
    }

    @Override
    public void takeRetake() {
        System.out.println(getName() + " is sitting a retake exam... fingers crossed!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " walks across campus.");
    }

    @Override
    public void dance() {
        System.out.println(getName() + " busts out moves at the party!");
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.gpa, other.gpa);
    }

    // Two students are equal if same name and same major
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student other)) return false;
        return getName().equals(other.getName()) && major.equals(other.major);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), major);
    }

    public String getMajor() { return major; }
    public double getGpa()   { return gpa;   }

    @Override
    public String toString() {
        return "Student[name=" + getName() + ", major=" + major
                + ", GPA=" + String.format("%.2f", gpa) + "]";
    }
}