package Practice3.Problem2;

public class Student extends Person {

    private String program;
    private int year;
    private double fee;

    public Student(String name, String address,
                   String program, int year, double fee) {
        super(name, address);

        if (program == null || program.isBlank())
            throw new IllegalArgumentException("Program cannot be null or empty");
        if (year <= 0)
            throw new IllegalArgumentException("Year must be positive");
        if (fee < 0)
            throw new IllegalArgumentException("Fee cannot be negative");

        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() { return program; }
    public void setProgram(String program) {
        if (program == null || program.isBlank())
            throw new IllegalArgumentException("Program cannot be null or empty");
        this.program = program;
    }

    public int getYear() { return year; }
    public void setYear(int year) {
        if (year <= 0)
            throw new IllegalArgumentException("Year must be positive");
        this.year = year;
    }

    public double getFee() { return fee; }
    public void setFee(double fee) {
        if (fee < 0)
            throw new IllegalArgumentException("Fee cannot be negative");
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString() +
                ", program=" + program +
                ", year=" + year +
                ", fee=" + fee + "]";
    }
}