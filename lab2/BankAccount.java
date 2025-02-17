public class BankAccount {
    private static int nextAccountNumber = 100000;
    private String customerName;
    private int accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String customerName, Integer accountNumber, double balance) {
        this.customerName = customerName;
        this.accountNumber = (accountNumber != null) ? accountNumber : nextAccountNumber++;
        this.balance = Math.round(balance * 100.0) / 100.0; // Ensures two decimal places
    }

    // Overloaded constructor for auto-generating account number
    public BankAccount(String customerName, double balance) {
        this(customerName, null, balance);
    }

    // Getters
    public String getCustomerName() {
        return customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBalance(double balance) {
        this.balance = Math.round(balance * 100.0) / 100.0;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            this.balance = Math.round(this.balance * 100.0) / 100.0;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            this.balance = Math.round(this.balance * 100.0) / 100.0;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Display account info
    public void displayAccountInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + String.format("%.2f", balance));
    }
}