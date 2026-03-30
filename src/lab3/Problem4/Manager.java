package lab3.Problem4;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, double annualSalary, Date hireDate, String nin, double bonus) {
        super(name, annualSalary, hireDate, nin);
        this.bonus = bonus;
        this.team = new Vector<>();
    }

    public Manager(String name, double annualSalary, double bonus) {
        super(name, annualSalary);
        this.bonus = bonus;
        this.team = new Vector<>();
    }

    public void addTeamMember(Employee e) { team.add(e); }
    public Vector<Employee> getTeam() { return team; }
    public double getBonus() { return bonus; }
    public void setBonus(double b) { this.bonus = b; }

    @Override
    public int compareTo(Employee other) {
        int cmp = super.compareTo(other);
        if (cmp != 0) return cmp;
        if (other instanceof Manager)
            return Double.compare(this.bonus, ((Manager) other).bonus);
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Manager{name='%s', salary=%.0f, bonus=%.0f, teamSize=%d}",
                name, getAnnualSalary(), bonus, team.size());
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof Manager)) return false;
        return Double.compare(bonus, ((Manager) o).bonus) == 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Manager copy = (Manager) super.clone();
        copy.team = new Vector<>();
        for (Employee e : team) copy.team.add((Employee) e.clone());
        return copy;
    }
}
