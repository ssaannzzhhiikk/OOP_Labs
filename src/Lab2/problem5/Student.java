package Lab2.problem5;

public class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() { return major; }

    @Override
    public String getOccupation() { return "Student (major: " + major + ")"; }
}
