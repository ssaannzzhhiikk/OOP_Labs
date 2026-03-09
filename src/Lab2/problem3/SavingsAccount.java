package Lab2.problem3;

public class SavingsAccount extends Account {
    private double interestRate; // in percentage

    public SavingsAccount(int accNumber, double interestRate) {
        super(accNumber);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }

    public double getInterestRate() { return interestRate; }

    @Override
    public String toString() {
        return "Savings" + super.toString() + " | Interest Rate: " + interestRate + "%";
    }
}
