package Lab2.problem3;

public class TestBank {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1001, 5.0);
        CheckingAccount checking = new CheckingAccount(1002);

        savings.deposit(1000);

        checking.deposit(500);
        checking.deposit(200);
        checking.withdraw(50);
        checking.withdraw(30); // 4th transaction - exceeds free limit
        checking.deposit(100); // 5th transaction

        Bank bank = new Bank();
        bank.openAccount(savings);
        bank.openAccount(checking);

        System.out.println("\n--- Before update ---");
        bank.printAll();

        bank.update(); // add interest to savings, deduct fees from checking

        System.out.println("\n--- After update ---");
        bank.printAll();

        // Transfer between accounts
        System.out.println("\n--- Transfer $200 from savings to checking ---");
        savings.transfer(200, checking);
        bank.printAll();

        bank.closeAccount(1002);
        System.out.println("\n--- After closing checking account ---");
        bank.printAll();
    }
}
