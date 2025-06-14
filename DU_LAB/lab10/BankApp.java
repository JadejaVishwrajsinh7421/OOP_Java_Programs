// Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Account Class
class Account {
    private String accountHolder;
    private double balance;
    private static final double MIN_BALANCE = 500.0;

    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
        System.out.println("Current Balance: ₹" + balance);
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance - amount < MIN_BALANCE) {
            throw new InsufficientFundsException(
                "Withdrawal denied! Minimum balance of ₹" + MIN_BALANCE + " must be maintained."
            );
        }
        balance -= amount;
        System.out.println("Withdrawn: ₹" + amount);
        System.out.println("Remaining Balance: ₹" + balance);
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: ₹" + balance);
    }
}

// Main class to test the Account
public class BankApp {
    public static void main(String[] args) {
        Account acc = new Account("Vishwrajsinh Jadeja", 1000.0);

        acc.displayBalance();

        acc.deposit(500.0);

        try {
            acc.withdraw(1200.0); // this will throw exception
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            acc.withdraw(800.0); // valid withdrawal
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        acc.displayBalance();
    }
}
