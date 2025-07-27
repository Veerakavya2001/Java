class BankAccount {
    // Private fields (Encapsulation)
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    // Method to get current balance
    public double getBalance() {
        return balance;
    }

    // Optional: method to get account number
    public String getAccountNumber() {
        return accountNumber;
    }
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount("1234567890", 1000.0);

        // Test methods
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Current Balance: " + account.getBalance());

	}

}
