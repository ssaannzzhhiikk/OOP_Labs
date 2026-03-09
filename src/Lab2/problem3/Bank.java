package Lab2.problem3;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<>();
    }

    public void openAccount(Account account) {
        accounts.add(account);
        System.out.println("Opened: " + account);
    }

    public void closeAccount(int accNumber) {
        accounts.removeIf(a -> a.getAccountNumber() == accNumber);
        System.out.println("Closed account #" + accNumber);
    }

    public void update() {
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).addInterest();
            } else if (account instanceof CheckingAccount) {
                ((CheckingAccount) account).deductFee();
            }
        }
    }

    public void printAll() {
        System.out.println("=== Bank Accounts ===");
        for (Account a : accounts) a.print();
    }
}
