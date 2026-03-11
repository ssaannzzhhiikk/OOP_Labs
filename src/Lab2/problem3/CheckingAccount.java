package Lab2.problem3;

public class CheckingAccount extends Account {
    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double FEE_PER_TRANSACTION = 0.02;

    public CheckingAccount(int accNumber) {
        super(accNumber);
        this.transactionCount = 0;
    }

    @Override
    public void deposit(double sum) {
        if (sum > 0) {
            super.deposit(sum);
            transactionCount++; // FIX (Bug 2): only count if deposit is valid
        }
    }

    @Override
    public void withdraw(double sum) {
        double balanceBefore = getBalance();
        super.withdraw(sum);
        if (getBalance() < balanceBefore) {
            transactionCount++; // FIX (Bug 2): only count if withdrawal actually succeeded
        }
    }

    public void deductFee() {
        if (transactionCount > FREE_TRANSACTIONS) {
            int extraTransactions = transactionCount - FREE_TRANSACTIONS;
            double fee = extraTransactions * FEE_PER_TRANSACTION;
            super.withdraw(fee);
            System.out.println("Fee deducted: $" + String.format("%.2f", fee));
        }
        transactionCount = 0; // FIX (Bug 1): reset counter after each billing cycle
    }

    public int getTransactionCount() { return transactionCount; }

    @Override
    public void update() {
        deductFee();
    }

    @Override
    public String toString() {
        return "Checking" + super.toString() + " | Transactions: " + transactionCount;
    }
}