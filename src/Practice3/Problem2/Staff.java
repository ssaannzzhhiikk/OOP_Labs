package Practice3.Problem2;

public class Staff extends Person {

    private String school;
    private double pay;

    public Staff(String name, String address,
                 String school, double pay) {
        super(name, address);

        if (school == null || school.isBlank())
            throw new IllegalArgumentException("School cannot be null or empty");
        if (pay < 0)
            throw new IllegalArgumentException("Pay cannot be negative");

        this.school = school;
        this.pay = pay;
    }

    public String getSchool() { return school; }

    public void setSchool(String school) {
        if (school == null || school.isBlank())
            throw new IllegalArgumentException("School cannot be null or empty");
        this.school = school;
    }

    public double getPay() { return pay; }

    public void setPay(double pay) {
        if (pay < 0)
            throw new IllegalArgumentException("Pay cannot be negative");
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[" + super.toString() +
                ", school=" + school +
                ", pay=" + pay + "]";
    }
}