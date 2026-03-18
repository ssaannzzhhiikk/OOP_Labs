package Practice4.task2;

public class Student implements Comparable<Student> {

    String name;
    double gpa;
    int    age;

    public Student(String name, double gpa, int age) {
        this.name = name;
        this.gpa  = gpa;
        this.age  = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', gpa=" + gpa + ", age=" + age + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return this.name.equals(other.name) && this.gpa == other.gpa;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(other.gpa, this.gpa);
    }
}
