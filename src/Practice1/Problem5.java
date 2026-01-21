package Practice1;

public class Problem5 {

    public static void main(String[] args) {

        double initialBalance = 1500.0;
        double interestRate = 4.5;

        double interest = initialBalance * interestRate / 100;
        double newBalance = initialBalance + interest;

        System.out.println("New balance: " + newBalance);
    }
}

