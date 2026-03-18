package Practice4.task2;


public class GradStudent implements Comparable<GradStudent>, Gradable {

    String name;
    double gpa;

    public GradStudent(String name, double gpa) {
        this.name = name;
        this.gpa  = gpa;
    }

    @Override
    public double getGpa() { return gpa; }

    @Override
    public String getGrade() {
        if (gpa >= 3.7) return "A";
        if (gpa >= 3.0) return "B";
        if (gpa >= 2.0) return "C";
        return "F";
    }

    @Override
    public boolean isPassing() {
        return gpa >= PASS_GPA;
    }

    @Override
    public int compareTo(GradStudent other) {
        return Double.compare(other.gpa, this.gpa);
    }

    @Override
    public String toString() {
        return name + " | GPA:" + gpa + " | Grade:" + getGrade()
               + " | Passing:" + isPassing();
    }
}
