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
        super.deposit(sum);
        transactionCount++;
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        transactionCount++;
    }

    public void deductFee() {
        if (transactionCount > FREE_TRANSACTIONS) {
            int extraTransactions = transactionCount - FREE_TRANSACTIONS;
            double fee = extraTransactions * FEE_PER_TRANSACTION;
            super.withdraw(fee);
            System.out.println("Fee deducted: $" + String.format("%.2f", fee));
        }
    }

    public int getTransactionCount() { return transactionCount; }

    @Override
    public String toString() {
        return "Checking" + super.toString() + " | Transactions: " + transactionCount;
    }
}
