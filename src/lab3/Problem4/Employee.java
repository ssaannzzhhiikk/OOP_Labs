package lab3.Problem4;

import java.util.Comparator;
import java.util.Date;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    private double annualSalary;
    private Date hireDate;
    private String nationalInsuranceNumber;

    public Employee(String name, double annualSalary, Date hireDate, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.hireDate = hireDate;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public Employee(String name, double annualSalary) {
        this(name, annualSalary, new Date(), "N/A");
    }

    public double getAnnualSalary() { return annualSalary; }
    public void setAnnualSalary(double s) { this.annualSalary = s; }
    public Date getHireDate() { return hireDate; }
    public void setHireDate(Date d) { this.hireDate = d; }
    public String getNationalInsuranceNumber() { return nationalInsuranceNumber; }
    public void setNationalInsuranceNumber(String n) { this.nationalInsuranceNumber = n; }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.annualSalary, other.annualSalary);
    }

    public static final Comparator<Employee> BY_NAME = Comparator.comparing(e -> e.name);

    public static final Comparator<Employee> BY_HIRE_DATE = Comparator.comparing(Employee::getHireDate);

    @Override
    public String toString() {
        return String.format("Employee{name='%s', salary=%.0f, hireDate=%tF, NIN='%s'}",
                name, annualSalary, hireDate, nationalInsuranceNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof Employee)) return false;
        Employee e = (Employee) o;
        return Double.compare(annualSalary, e.annualSalary) == 0
                && nationalInsuranceNumber.equals(e.nationalInsuranceNumber);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Employee copy = (Employee) super.clone();
        copy.hireDate = (Date) hireDate.clone();
        return copy;
    }
}
